package net.skyrimcraft.src.proxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.settings.KeyBinding;
import net.skyrimcraft.src.entity.EntityImperialGuard;
import net.skyrimcraft.src.handler.CrossMenuKeyHandler;
import net.skyrimcraft.src.render.RenderImperialGuard;

import org.lwjgl.input.Keyboard;

import com.jadarstudios.developercapes.DevCapesUtil;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityImperialGuard.class, new RenderImperialGuard());
		DevCapesUtil.addFileUrl("https://www.dropbox.com/s/u56tl0lmfof3i05/capes.txt");
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