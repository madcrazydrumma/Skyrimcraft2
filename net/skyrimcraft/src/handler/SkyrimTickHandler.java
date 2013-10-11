package net.skyrimcraft.src.handler;

import java.util.EnumSet;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SkyrimTickHandler extends Gui implements ITickHandler
{
	@SideOnly(Side.CLIENT)
	public boolean drawChestString = true;
	
	private Minecraft mc = Minecraft.getMinecraft();
	
	private String s = "";
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		
	}
	
	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
		EntityPlayer player = (EntityPlayer) tickData[0];

		World world = player.worldObj;

		MovingObjectPosition coordinates = player.rayTrace(5, 1);

		if(coordinates != null) {
			int x = coordinates.blockX, y = coordinates.blockY, z = coordinates.blockZ;
			Block block = Block.blocksList[world.getBlockId(x, y, z)];
			if(block.equals(Block.chest)) {
				drawChestString = true;
			} else {
				drawChestString = false;
			}
		}
	}
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void renderGameOverlay(RenderGameOverlayEvent.Post event )
	{
		if (event.type.equals(ElementType.CROSSHAIRS)) {
			
			int width = event.resolution.getScaledWidth();
			int height = event.resolution.getScaledHeight();
			FontRenderer fontrenderer = mc.fontRenderer;

			if(drawChestString) {
				s = "Open Chest (F)";
			} else {
				s = "";
			}

			//drawCenteredString(fontrenderer, s, width / 2 + 10, height / 2, 0xffffff);
		}
	}
	
	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}
	
	@Override
	public String getLabel() {
		return "skyrimcraftII";
	}
}