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

public class ExtendedPlayer implements IExtendedEntityProperties
{
	public final static String EXT_PROP_NAME = "ExtendedPlayer";
	
	public static EntityPlayer player;
	public static World world;
	
	public int maxMana, currentMana;
	
	public ExtendedPlayer(EntityPlayer p, World w) {
		this.player = p;
		this.world = w;
		this.currentMana = this.maxMana = 20;
	}
	
	public static final void register(EntityPlayer player)
	{
		player.registerExtendedProperties(ExtendedPlayer.EXT_PROP_NAME, new ExtendedPlayer(player, world));
	}
	
	public static final ExtendedPlayer get(EntityPlayer player)
	{
		return (ExtendedPlayer) player.getExtendedProperties(EXT_PROP_NAME);
	}
	
	public void setCurrentMana(int amount) {
		this.currentMana = (amount < this.maxMana ? amount : this.maxMana);
		this.sync();
	}
	
	public void setMaxMana(int amount) {
		this.maxMana = (amount > 0 ? amount : 0);
		this.sync();
	}
	
	public int getMaxMana() {
		return this.maxMana;
	}
	
	public int getMana() {
		return this.currentMana;
	}
	
	public final void sync() {
		ByteArrayOutputStream bos = new ByteArrayOutputStream(8);
		DataOutputStream outputStream = new DataOutputStream(bos);
		
		try {
			outputStream.write(this.maxMana);
			outputStream.writeInt(this.currentMana);
		} catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		Packet250CustomPayload packet = new Packet250CustomPayload("skyrimcraftii", bos.toByteArray());
		
		if (FMLCommonHandler.instance().getEffectiveSide().isServer()) {
			EntityPlayerMP player1 = (EntityPlayerMP) player;
			PacketDispatcher.sendPacketToPlayer(packet, (Player) player1);
		}
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = new NBTTagCompound();
		properties.setInteger("CurrentMana", this.currentMana);
		properties.setInteger("MaxMana", this.maxMana);
		compound.setTag(EXT_PROP_NAME, properties);
	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		NBTTagCompound properties = (NBTTagCompound) compound.getTag(EXT_PROP_NAME);
		this.currentMana = properties.getInteger("CurrentMana");
		this.maxMana = properties.getInteger("MaxMana");
	}

	@Override
	public void init(Entity entity, World world) {
	}
}