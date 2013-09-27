package net.skyrimcraft.src.handler;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.skyrimcraft.src.base.SkyrimcraftII;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class SkyrimKeyHandler extends KeyHandler
{
	 public SkyrimKeyHandler(KeyBinding[] keyBindings, boolean[] repeatings)
     {
             super(keyBindings, repeatings);
     }
	
	@Override
	public String getLabel() {
		return "skyrimbindings";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
	{
		Minecraft mc = Minecraft.getMinecraft();
		if(kb.equals(SkyrimcraftII.key) && mc.inGameHasFocus) {
			mc.thePlayer.openGui(SkyrimcraftII.instance, 21, mc.theWorld, mc.thePlayer.chunkCoordX, mc.thePlayer.chunkCoordY, mc.thePlayer.chunkCoordZ);
		}
	}

	@Override
	public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd) {
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.CLIENT);
	}
}