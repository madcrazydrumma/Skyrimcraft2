package net.skyrimcraft.src.content;

import net.skyrimcraft.src.base.SkyrimRegistry;
import net.skyrimcraft.src.dimension.provider.SovngardeWorldProvider;

public class SkyrimDimensions
{
	public static void register() {
		SkyrimRegistry.registerDimension(20, SovngardeWorldProvider.class);
	}
}