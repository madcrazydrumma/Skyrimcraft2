package net.skyrimcraft.src.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.settings.KeyBinding;
import net.skyrimcraft.src.entity.EntityImperialGuard;
import net.skyrimcraft.src.handler.CrossMenuKeyHandler;
import net.skyrimcraft.src.handler.SkyrimTickHandler;
import net.skyrimcraft.src.render.RenderImperialGuard;

import org.lwjgl.input.Keyboard;

import com.jadarstudios.developercapes.DevCapesUtil;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityImperialGuard.class, new RenderImperialGuard());
		DevCapesUtil.addFileUrl("https://dl.dropboxusercontent.com/u/115533780/capes.txt");
		TickRegistry.registerTickHandler(new SkyrimTickHandler(), Side.CLIENT);
	}
	
	@Override
	public void addKeybinds() {
		KeyBinding[] key = {new KeyBinding("Cross Menu", Keyboard.KEY_M)};
		boolean[] repeat = {false};
		KeyBindingRegistry.registerKeyBinding(new CrossMenuKeyHandler(key, repeat));
	}
	
	public static int addArmor(String str)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(str);
	}
	
	public ModelBiped getArmorModel(int id){
		return null;
	}
}