package net.skyrimcraft.src.proxy;

import com.jadarstudios.developercapes.DevCapesUtil;

import net.minecraftforge.client.MinecraftForgeClient;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.content.SkyrimItems;
import net.skyrimcraft.src.entity.EntityImperialGuard;
import net.skyrimcraft.src.render.RenderImperialGuard;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityImperialGuard.class, new RenderImperialGuard());
		DevCapesUtil.addFileUrl("https://www.dropbox.com/s/u56tl0lmfof3i05/capes.txt");
	}
	
	public static int addArmor(String str)
	{
		return RenderingRegistry.addNewArmourRendererPrefix(str);
	}
}
