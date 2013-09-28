package net.skyrimcraft.src.handler;

import java.util.EnumSet;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;
import net.skyrimcraft.src.base.ExtendedPlayer;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;

public class SkyrimTickHandler extends Gui implements ITickHandler
{
	public boolean drawChestString = false;
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
					drawChestString = true;
				} else {
					drawChestString = false;
				}
			}
		}
	}
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void renderGameOverlay(RenderGameOverlayEvent event )
	{
		if(event.isCancelable() || event.type != ElementType.EXPERIENCE)
		{
			return;
		}
		int width = event.resolution.getScaledWidth();
		int height = event.resolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		
		if(drawChestString == true) {
			drawCenteredString(fontrenderer, "Open Chest (F)", width / 2 + 10, height / 2, 0xffffff);
		} else {
			drawCenteredString(fontrenderer, "", width / 2 + 10, height / 2, 0xffffff);
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