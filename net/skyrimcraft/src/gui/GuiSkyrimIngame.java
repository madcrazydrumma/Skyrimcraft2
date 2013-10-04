package net.skyrimcraft.src.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeSubscribe;

import org.lwjgl.opengl.GL11;

public class GuiSkyrimIngame extends Gui
{
	private Minecraft mc = Minecraft.getMinecraft();
	
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
		
		drawRect(width / 2 - 93, 10, width / 2 + 94, 22, 0xCC000000);
		ResourceLocation icons = new ResourceLocation("skyrimcraftii", "textures/gui/icons.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.renderEngine.bindTexture(icons);
		drawTexturedModalRect(width / 2 - 110, 10, 0, 37, 221, 14);
		
		//BARS
		drawTexturedModalRect(20, height - 40, 0, 24, 100, 8);
		drawTexturedModalRect(width / 2 - 50, height - 40, 0, 24, 100, 8);
		drawTexturedModalRect(width - 120, height - 40, 0, 24, 100, 8);
		
		//INNER BARS
		drawTexturedModalRect(23, height - 39, 0, 60, 94, 4);
		
		int direction = MathHelper.floor_double((double)((mc.thePlayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
		
		String s = "";
		
		if(direction == 0) {
			//SOUTH
			s = "S";
		} else if(direction == 1) {
			//WEST
			s = "W";
		} else if(direction == 2) {
			//NORTH
			s = "N";
		} else if(direction == 3) {
			//EAST
			s = "E";
		}
		drawString(fontrenderer, s, width / 2, 13, 0xffffff);
	}
}