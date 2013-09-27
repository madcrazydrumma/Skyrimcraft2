package net.skyrimcraft.src.handler;

import java.util.EnumSet;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class SkyrimTickHandler implements ITickHandler
{
	private Minecraft mc = Minecraft.getMinecraft();
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		
	}
	
	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		//when tick is recieved
		EntityPlayer player = mc.thePlayer;
		
		World world = player.worldObj;
		
		if(!world.isRemote) {
			MovingObjectPosition coordinates = player.rayTrace(20, 1);
			
			if(coordinates != null) {
				int x = coordinates.blockX, y = coordinates.blockY, z = coordinates.blockZ;
				Block block = Block.blocksList[world.getBlockId(x, y, z)];
				if(block == Block.chest) {
					
				} else {
					
				}
			}
		}
	}
	
	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}
	
	@Override
	public String getLabel() {
		return "skyrimcraftII";
	}
}