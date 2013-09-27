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
	static KeyBinding menu = new KeyBinding("Options Menu", Keyboard.KEY_M);
	private Minecraft mc = Minecraft.getMinecraft();
	
	public SkyrimKeyHandler() {
		super(new KeyBinding[] {menu}, new boolean[] {false});
	}
	
	@Override
	public String getLabel() {
		return "skyrimbindings";
	}

	@Override
	public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat) {
		if(kb.equals(menu) && mc.inGameHasFocus) {
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