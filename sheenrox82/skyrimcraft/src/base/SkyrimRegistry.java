package sheenrox82.skyrimcraft.src.base;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import sheenrox82.skyrimcraft.src.handler.GuiHandler;
import sheenrox82.skyrimcraft.src.world.gen.WorldGenOverworld;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class SkyrimRegistry 
{
	public static void register()
	{
		NetworkRegistry.instance().registerGuiHandler(SkyrimcraftII.instance, new GuiHandler());	
		GameRegistry.registerWorldGenerator(new WorldGenOverworld());

		if(Config.snowyWorld)
		{
			BiomeGenBase.plains.setEnableSnow().setTemperatureRainfall(0.0F, 0.5F);
			BiomeGenBase.forest.setEnableSnow().setTemperatureRainfall(0.0F, 0.5F);
			BiomeGenBase.forestHills.setEnableSnow().setTemperatureRainfall(0.0F, 0.5F);
			BiomeGenBase.extremeHills.setEnableSnow().setTemperatureRainfall(0.0F, 0.5F);
			BiomeGenBase.river.setEnableSnow().setTemperatureRainfall(0.0F, 0.5F);
			GameRegistry.removeBiome(BiomeGenBase.desert);
			GameRegistry.removeBiome(BiomeGenBase.desertHills);	
			GameRegistry.removeBiome(BiomeGenBase.jungle);
			GameRegistry.removeBiome(BiomeGenBase.jungleHills);	
			GameRegistry.removeBiome(BiomeGenBase.beach);
		}
	}

	public static void registerItem(Item item, String name)
	{
		GameRegistry.registerItem(item, name);
		LanguageRegistry.addName(item, name);
	}

	public static void registerBlock(Block block, String name)
	{
		GameRegistry.registerBlock(block, name);
		LanguageRegistry.addName(block, name);
	}

}
