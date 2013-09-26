package net.skyrimcraft.src.proxy;

import net.skyrimcraft.src.handler.SkyrimKeyHandler;
import cpw.mods.fml.client.registry.KeyBindingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		KeyBindingRegistry.registerKeyBinding(new SkyrimKeyHandler());
	}
}
