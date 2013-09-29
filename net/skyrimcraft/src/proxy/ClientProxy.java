package net.skyrimcraft.src.proxy;

import net.skyrimcraft.src.entity.EntityImperialGuard;
import net.skyrimcraft.src.handler.SkyrimTickHandler;
import net.skyrimcraft.src.render.RenderImperialGuard;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityImperialGuard.class, new RenderImperialGuard());
	}
}
