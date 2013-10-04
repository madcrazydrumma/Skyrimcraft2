package net.skyrimcraft.src.proxy;

import org.lwjgl.input.Keyboard;

import com.jadarstudios.developercapes.DevCapesUtil;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.client.MinecraftForgeClient;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.content.SkyrimItems;
import net.skyrimcraft.src.entity.EntityImperialGuard;
import net.skyrimcraft.src.handler.CrossMenuKeyHandler;
import net.skyrimcraft.src.render.RenderImperialGuard;
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
	
	public static void addKeybinds() {
		KeyBinding[] key = {new KeyBinding("Cross Menu", Keyboard.KEY_M)};
		boolean[] repeat = {false};
		KeyBindingRegistry.registerKeyBinding(new CrossMenuKeyHandler(key, repeat));
	}
	
	public static int addArmor(String str)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(str);
	}
}
