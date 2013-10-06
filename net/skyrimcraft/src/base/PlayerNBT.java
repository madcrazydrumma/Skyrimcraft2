package net.skyrimcraft.src.base;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

public class PlayerNBT implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "PlayerNBT";
	
	private EntityPlayer player;
	
	public int maxMana, currentMana;
	public int MANA_WATCHER = 20;
	
	public PlayerNBT(EntityPlayer player) {
		this.player = player;
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(PlayerNBT.EXT_PROP_NAME, new PlayerNBT(player));
	}
	
	public static final PlayerNBT get(EntityPlayer player)
	{
		return (PlayerNBT) player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		
		properties.setInteger("currentMana", this.player.getDataWatcher().getWatchableObjectInt(MANA_WATCHER));
		
		compound.setCompoundTag(EXT_PROP_NAME, properties);
	}
	
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound)compound.getTag(EXT_PROP_NAME);
		this.player.getDataWatcher().updateObject(MANA_WATCHER, properties.getInteger("currentMana"));
	}
	
	public final boolean consumeMana(int amount)
	{
		int mana = this.player.getDataWatcher().getWatchableObjectInt(MANA_WATCHER);
		boolean sufficient = amount <= mana;
		
		mana -= (amount < mana ? amount : mana);
		this.player.getDataWatcher().updateObject(MANA_WATCHER, mana);
		
		return sufficient;
	}
	
	public final void replenishMana()
	{
		this.player.getDataWatcher().updateObject(MANA_WATCHER, this.maxMana);
	}
	
	public final int getCurrentMana()
	{
		return this.player.getDataWatcher().getWatchableObjectInt(MANA_WATCHER);
	}
	
	public final void setCurrentMana(int amount)
	{
		this.player.getDataWatcher().updateObject(MANA_WATCHER, (amount < this.maxMana ? amount : this.maxMana));
	}
	
	public final void setMaxMana(int amount)
	{
		this.maxMana = (amount > 0 ? amount : 0);
		this.sync();
	}
	
	public final int getMaxMana() {
		return this.maxMana;
	}
	
	public final void sync()
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
		DataOutputStream outputStream = new DataOutputStream(bos);
		
		try {
			outputStream.writeInt(this.maxMana);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
		Packet250CustomPayload packet = new Packet250CustomPayload("tutchannel", bos.toByteArray());
		
		if (FMLCommonHandler.instance().getEffectiveSide().isServer()) {
			EntityPlayerMP player1 = (EntityPlayerMP) player;
			PacketDispatcher.sendPacketToPlayer(packet, (Player) player1);
		}
	}
	
	@Override
	public void init(Entity entity, World world) {
		this.maxMana = this.currentMana = 20;
		this.player.getDataWatcher().addObject(MANA_WATCHER, this.maxMana);
	}
}