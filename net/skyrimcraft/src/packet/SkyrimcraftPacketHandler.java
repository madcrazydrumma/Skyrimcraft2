package net.skyrimcraft.src.packet;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import net.skyrimcraft.src.base.ExtendedPlayer;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class SkyrimcraftPacketHandler implements IPacketHandler
{
	@Override
	public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
		if(packet.channel.equals("skyrimcraftii")) {
			handlePackets(packet, player);
		}
	}
	
	private void handlePackets(Packet250CustomPayload packet, Player player) {
		DataInputStream inputStream = new DataInputStream(new ByteArrayInputStream(packet.data));
		ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer) player);
		
		try {
			props.setMaxMana(inputStream.readInt());
			props.setCurrentMana(inputStream.readInt());
		} catch(IOException e) {
			e.printStackTrace();
			return;
		}
	}
}