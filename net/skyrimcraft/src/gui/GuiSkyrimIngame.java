package net.skyrimcraft.src.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;

public class GuiSkyrimIngame extends GuiIngame
{
	public GuiSkyrimIngame(Minecraft par1Minecraft) {
		super(par1Minecraft);
	}
	
	public void renderGameOverlay(float par1, boolean par2, int par3, int par4)
	{
		ScaledResolution scaledresolution = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
		int k = scaledresolution.getScaledWidth();
		int l = scaledresolution.getScaledHeight();
		FontRenderer fontrenderer = this.mc.fontRenderer;
		fontrenderer.drawStringWithShadow("Gold: ", 10, 10, 0xffffff);
	}
}