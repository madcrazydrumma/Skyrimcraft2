package net.skyrimcraft.src.base;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import cpw.mods.fml.common.network.PacketDispatcher;
import cpw.mods.fml.common.network.Player;

public class PlayerNBT implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "SkyrimMana";
	
	private final String currentManaTag = "currentMana";
	private final String currentGoldTag = "gold";
	
	private EntityPlayer player;
	
	public int maxMana;
	public int MANA_WATCHER = 20;
	
	public int gold;
	public int GOLD_WATCHER = 21;
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(PlayerNBT.EXT_PROP_NAME, new PlayerNBT());
	}
	
	public static final PlayerNBT get(EntityPlayer player)
	{
		return (PlayerNBT) player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	@Override
	public void saveNBTData(NBTTagCompound compound) {
		compound.setInteger(this.currentManaTag, this.getCurrentMana());
		compound.setInteger(this.currentGoldTag, this.getGold());
	}
	
	@Override
	public void loadNBTData(NBTTagCompound compound) {
		this.setGold(compound.getInteger(this.currentGoldTag));
	}
	
	public final void sync()
	{
		ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
		DataOutputStream outputStream = new DataOutputStream(bos);
		
		try {
			outputStream.writeInt(this.getCurrentMana());
			outputStream.writeInt(this.getGold());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	
		Packet250CustomPayload packet = new Packet250CustomPayload("skyrimcraftii", bos.toByteArray());
		
		if (this.player.worldObj.isRemote) {
			EntityClientPlayerMP player1 = (EntityClientPlayerMP) player;
			player1.sendQueue.addToSendQueue(packet);
		}
	}
	
	public final boolean consumeMana(int amount)
	{
		int mana = this.getCurrentMana();
		boolean sufficient = amount <= mana;
		
		mana -= (amount < mana ? amount : mana);
		this.setCurrentMana(mana);
		
		return sufficient;
	}
	
	public final void replenishMana()
	{
		this.player.getDataWatcher().updateObject(MANA_WATCHER, Integer.valueOf(this.maxMana));
	}
	
	public final int getCurrentMana()
	{
		return this.player.getDataWatcher().getWatchableObjectInt(MANA_WATCHER);
	}
	
	public final void setCurrentMana(int amount)
	{
		this.player.getDataWatcher().updateObject(MANA_WATCHER, Integer.valueOf((amount < this.maxMana ? amount : this.maxMana)));
		this.sync();
	}
	
	public final void setMaxMana(int amount)
	{
		this.maxMana = (amount > 0 ? amount : 0);
		this.sync();
	}
	
	public final int getMaxMana() {
		return this.maxMana;
	}
	
	public final boolean addGold(int amount)
	{
		int g = this.getGold();
		boolean sufficient = amount >= g;
		
		g += (amount > g ? amount : g);
		this.setGold(g);
		
		return sufficient;
	}
	
	public final void setGold(int amount) {
		this.player.getDataWatcher().updateObject(GOLD_WATCHER, Integer.valueOf((amount > 0 ? amount : 0)));
		this.sync();
	}
	
	public final int getGold() {
		return this.gold;
	}
	
	@Override
	public void init(Entity entity, World world) {
		this.player = (EntityPlayer) entity;
		this.gold = 0;
		this.maxMana = 20;
		this.player.getDataWatcher().addObject(MANA_WATCHER, Integer.valueOf(this.maxMana));
	}
}