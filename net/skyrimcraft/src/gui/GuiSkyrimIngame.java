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
import net.skyrimcraft.src.base.PlayerNBT;

import org.lwjgl.opengl.GL11;

public class GuiSkyrimIngame extends Gui
{
	private Minecraft mc = Minecraft.getMinecraft();
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
	public void renderGameOverlay(RenderGameOverlayEvent event )
	{
		if(event.type == ElementType.HEALTH || event.type == ElementType.ARMOR
				|| event.type == ElementType.FOOD || event.type == ElementType.EXPERIENCE)
		{
			event.setCanceled(true);
			return;
		}
		int width = event.resolution.getScaledWidth();
		int height = event.resolution.getScaledHeight();
		FontRenderer fontrenderer = mc.fontRenderer;
		PlayerNBT props = PlayerNBT.get(this.mc.thePlayer);
		
		if (props == null || props.getMaxMana() == 0)
		{
			return;
		}
		
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
		float magicka = (float) (props.getCurrentMana() * 4.1);
		float health = (float) (mc.thePlayer.getHealth() * 4.1);
		float stamina = (float) (mc.thePlayer.getFoodStats().getFoodLevel() * 4.1);
		//End checking stuff
		
		//INNER BARS
		drawTexturedModalRect(31, height - 38, 11, 64, (int)magicka, 6); //mana
		drawTexturedModalRect(width / 2 - 39, height - 38, 11, 72, (int)health, 6); //health
		drawTexturedModalRect(width - 109, height - 38, 11, 80, (int)stamina, 6); //stamina
		
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
			drawCenteredString(fontrenderer, flag2 ? "N" : "", (width / 2 - r) + 180, 13, 0xffffff);

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
		
		if(mc.thePlayer.capabilities.isCreativeMode) {
			drawString(fontrenderer, "Creative", 10, 10, 0xffffff);
		} else {
			drawString(fontrenderer, "Survival", 10, 10, 0xffffff);
		}
		
		drawString(fontrenderer, mc.thePlayer.username, 10, 20, 0xffffff);
	}
}