package net.skyrimcraft.src.base;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.skyrimcraft.src.handler.CrossMenuKeyHandler;
import net.skyrimcraft.src.handler.GuiHandler;
import net.skyrimcraft.src.world.gen.WorldGenOverworld;

import org.lwjgl.input.Keyboard;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class SkyrimRegistry 
{
	public static int id = 500;
	
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
			KeyBinding[] key = {new KeyBinding("Cross Menu", Keyboard.KEY_M)};
			boolean[] repeat = {false};
			KeyBindingRegistry.registerKeyBinding(new CrossMenuKeyHandler(key, repeat));
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
	
	public static void registerEntity(Class entityClass, String entityName)
	{
		int entityID = Config.addEntity(entityName);
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, entityID);
		EntityRegistry.registerModEntity(entityClass, entityName, entityID, SkyrimcraftII.instance, 128, 1, true);
		LanguageRegistry.instance().addStringLocalization("entity." + entityName + ".name", entityName);
	}

	public static void registerEgg(Class entityClass, int color1, int color2)
	{
		int ID = uniqueEggID();
		EntityList.IDtoClassMapping.put(ID, entityClass);
		EntityList.entityEggs.put(ID, new EntityEggInfo(ID, color1, color2));
	}

	public static int uniqueEggID()
	{
		return id++;
	}	

	public static void addSpawn(Class<? extends EntityLiving> entityClass, int spawnProb, int min, int max, BiomeGenBase[] biomes) {
		if (spawnProb > 0) {
			EntityRegistry.addSpawn(entityClass, spawnProb, min, max, EnumCreatureType.creature, biomes);
		}
	}
	
	public static void registerDimension(int id, Class worldProvider)
	{
		DimensionManager.registerProviderType(id, worldProvider, true);
		DimensionManager.registerDimension(id, id);
	}
}