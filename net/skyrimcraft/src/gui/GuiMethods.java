package net.skyrimcraft.src.gui;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;

import org.lwjgl.opengl.GL11;

public class GuiMethods extends Gui
{
	public void drawSizedText(FontRenderer fr, String string, int x, int y, int big_small)
	{
		if(big_small == 0)
		{
			GL11.glPushMatrix();
			GL11.glScalef(0.5f, 0.5f, 0.5f);
			drawString(fr, string, x * 2, y * 2, 0xffffffff);
			GL11.glPopMatrix();
		} else if(big_small == 1)
		{
			GL11.glPushMatrix();
			GL11.glScalef(2f, 2f, 2f);
			drawString(fr, string, (x - 5) / 2, (y - 5) / 2, 0xffffffff);
			GL11.glPopMatrix();
		}
	}
}