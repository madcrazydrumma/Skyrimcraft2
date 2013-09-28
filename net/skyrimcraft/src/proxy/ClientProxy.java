package net.skyrimcraft.src.proxy;

import net.skyrimcraft.src.entity.EntityImperialGuard;
import net.skyrimcraft.src.render.RenderImperialGuard;
import cpw.mods.fml.client.registry.RenderingRegistry;


public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityImperialGuard.class, new RenderImperialGuard());
	}
}
