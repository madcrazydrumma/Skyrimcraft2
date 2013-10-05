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
		drawTexturedModalRect(20, height - 40, 0, 51, 102, 10);
		drawTexturedModalRect(width / 2 - 50, height - 40, 0, 51, 102, 10);
		drawTexturedModalRect(width - 120, height - 40, 0, 51, 102, 10);
		
		//Checking stuff for mana and health and stamina
		//End checking stuff
		
		//INNER BARS
		drawTexturedModalRect(31, height - 38, 11, 64, 82, 6); //mana
		drawTexturedModalRect(width / 2 - 39, height - 38, 11, 72, 82, 6); //health
		drawTexturedModalRect(width - 109, height - 38, 11, 80, 82, 6); //stamina
		
		int r = 0;
		if (mc.thePlayer.rotationYaw < 0) {
			r = -MathHelper.floor_double(mc.thePlayer.rotationYaw % 360);
		} else {
			r = MathHelper.floor_double(mc.thePlayer.rotationYaw % 360);
		}

		boolean flag1 = (r > 0 && r < 180);
		boolean flag2 = (r <= 270 && r >= 90);
		boolean flag3 = (r <= 180 && r >= 0);
		boolean flag5 = (r <= 1 && r >= 0);
		boolean flag4 = mc.thePlayer.rotationYaw < 0;

		if (r == 0) {
			drawCenteredString(fontrenderer, "S", width / 2, 13, 0xffffff);
			drawCenteredString(fontrenderer, "E", (width / 2) - 90, 13, 0xffffff);
			drawCenteredString(fontrenderer, "W", (width / 2) + 90, 13, 0xffffff);
		} else if (!flag4) {
			drawCenteredString(fontrenderer, flag2 ? "N" : "",
					(width / 2 - r) + 180, 13, 0xffffff);

			if (!flag1) {
				r = r - 360;
			}
			drawCenteredString(fontrenderer, !flag2 ? "S" : "", width / 2 - r, 13,
					0xffffff);
			drawCenteredString(fontrenderer, !flag3 ? "E" : "",
					(width / 2 - r) - 90, 13, 0xffffff);
			drawCenteredString(fontrenderer, flag3 ? "W" : "",
					(width / 2 - r) + 90, 13, 0xffffff);
		} else if (flag4) {
			drawCenteredString(fontrenderer, flag2 ? "N" : "",
					(width / 2 + r) - 180, 13, 0xffffff);

			if (!flag1) {
				r = r - 360;
			}

			drawCenteredString(fontrenderer, !flag2 ? "S" : "", width / 2 + r, 13,
					0xffffff);
			drawCenteredString(fontrenderer, !flag3 ? "W" : "",
					(width / 2 + r) + 90, 13, 0xffffff);
			drawCenteredString(fontrenderer, flag3 ? "E" : "",
					(width / 2 + r) - 90, 13, 0xffffff);
		}
	}
}