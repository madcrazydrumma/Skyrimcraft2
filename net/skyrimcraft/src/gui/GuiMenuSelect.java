package net.skyrimcraft.src.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.skyrimcraft.src.base.SkyrimcraftII;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class GuiMenuSelect extends GuiScreen
{
	public static boolean drawLeft = false, drawRight = false;
	public static boolean drawUp = false, drawDown = false;
	
	public GuiMenuSelect()
	{
		this.allowUserInput = true;
	}
	
	@Override
	public boolean doesGuiPauseGame()
	{
		return true;
	}
	
	public void onGuiClosed(){}
	
	@Override
	protected void actionPerformed(GuiButton guibutton)
	{
	}
	
	@Override
	public void initGui()
	{
		buttonList.clear();
	}
	
	@Override
	protected void keyTyped(char par1, int par2)
	{
		if(!mc.inGameHasFocus)
		{
			if (par2 == 1 || par2 == Keyboard.KEY_R)
			{
				this.mc.displayGuiScreen((GuiScreen)null);
				this.mc.setIngameFocus();
			}
		}
		if(par2 == Keyboard.KEY_LEFT)
		{
			//left option
			drawLeft = true;
			drawRight = false;
			drawUp=false;
			drawDown=false;
		}
		if(par2 == Keyboard.KEY_RIGHT)
		{
			//right option
			drawRight = true;
			drawLeft = false;
			drawUp=false;
			drawDown=false;
		}
		if(par2 == Keyboard.KEY_UP)
		{
			//up option
			drawUp = true;
			drawRight = false;
			drawLeft=false;
			drawDown=false;
		}
		if(par2 == Keyboard.KEY_DOWN)
		{
			//down option
			drawDown = true;
			drawRight = false;
			drawUp=false;
			drawLeft=false;
		}
		
		if(drawUp == true) {
			if(par2 == Keyboard.KEY_RETURN) {
				//SKILLS
				//?
			}
		}
		if(drawDown == true) {
			if(par2 == Keyboard.KEY_RETURN) {
				//MAP
				//?
			}
		}
		if(drawRight == true) {
			if(par2 == Keyboard.KEY_RETURN) {
				//ITEMS <- Sorted
				 EntityPlayer p = mc.thePlayer;
				 mc.setIngameFocus();
				 mc.displayGuiScreen(new GuiInventory(p));
			}
		}
		if(drawLeft == true) {
			if(par2 == Keyboard.KEY_RETURN) {
				//MAGIC <- Sorted
				mc.setIngameFocus();
				mc.thePlayer.openGui(SkyrimcraftII.instance, 22, mc.theWorld, mc.thePlayer.chunkCoordX, mc.thePlayer.chunkCoordY, mc.thePlayer.chunkCoordZ);
			}
		}
	}
	
	public void drawScreen(int par1, int par2, float par3)
	{
		drawDefaultBackground();
		
		ResourceLocation cross = new ResourceLocation("skyrimcraftii", "textures/gui/cross.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		mc.func_110434_K().func_110577_a(cross);
		drawTexturedModalRect(width / 2 - 120, height / 2 - 50, 0, 81, 230, 101);
		
		GuiMethods m = new GuiMethods();
		
		if(drawLeft)
		{
			drawTexturedModalRect(width / 2 - 170, height / 2 - 10, 53, 0, 17, 18);
			drawString(fontRenderer, "Skills", width / 2 - 4, height / 2 - 65, 0xffffff);
			drawString(fontRenderer, "Map", width / 2 - 1, height / 2 + 55, 0xffffff);
			drawString(fontRenderer, "Items", width / 2 + 118, height / 2 - 4, 0xffffff);
			m.drawSizedText(fontRenderer, "Magic", width / 2 - 144, height / 2 - 4, 1);
		}else if(drawRight)
		{
			drawTexturedModalRect(width / 2 + 165, height / 2 - 10, 36, 0, 17, 18);
			drawString(fontRenderer, "Skills", width / 2 - 4, height / 2 - 65, 0xffffff);
			drawString(fontRenderer, "Map", width / 2 - 1, height / 2 + 55, 0xffffff);
			m.drawSizedText(fontRenderer, "Items", width / 2 + 115, height / 2 - 4, 1);
			drawString(fontRenderer, "Magic", width / 2 - 135, height / 2 - 4, 0xffffff);
		}else if(drawUp)
		{
			drawTexturedModalRect(width / 2 - 2, height / 2 - 90, 0, 0, 17, 18);
			m.drawSizedText(fontRenderer, "Skills", width / 2 - 11, height / 2 - 65, 1);
			drawString(fontRenderer, "Map", width / 2 - 1, height / 2 + 55, 0xffffff);
			drawString(fontRenderer, "Items", width / 2 + 118, height / 2 - 4, 0xffffff);
			drawString(fontRenderer, "Magic", width / 2 - 135, height / 2 - 4, 0xffffff);
		}else if(drawDown)
		{
			drawTexturedModalRect(width / 2 - 3, height / 2 + 70, 18, 0, 17, 18);
			drawString(fontRenderer, "Skills", width / 2 - 4, height / 2 - 65, 0xffffff);
			m.drawSizedText(fontRenderer, "Map", width / 2 - 6, height / 2 + 55, 1);
			drawString(fontRenderer, "Items", width / 2 + 118, height / 2 - 4, 0xffffff);
			drawString(fontRenderer, "Magic", width / 2 - 135, height / 2 - 4, 0xffffff);
		}else{
			drawString(fontRenderer, "Skills", width / 2 - 4, height / 2 - 65, 0xffffff);
			drawString(fontRenderer, "Map", width / 2 - 1, height / 2 + 55, 0xffffff);
			drawString(fontRenderer, "Items", width / 2 + 118, height / 2 - 4, 0xffffff);
			drawString(fontRenderer, "Magic", width / 2 - 135, height / 2 - 4, 0xffffff);
		}
		/*
		drawString(fontRenderer, "Skills", width / 2 - 4, height / 2 - 65, 0xffffff);
		drawString(fontRenderer, "Map", width / 2 - 2, height / 2 + 55, 0xffffff);
		drawString(fontRenderer, "Items", width / 2 + 118, height / 2 - 4, 0xffffff);
		drawString(fontRenderer, "Magic", width / 2 - 135, height / 2 - 4, 0xffffff);*/
		
		super.drawScreen(par1, par2, par3);
	}
}