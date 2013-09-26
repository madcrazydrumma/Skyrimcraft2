package net.skyrimcraft.src.base;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static Configuration config;
	public static int blockID = 2000;
	public static int itemID = 5000;
	public static int biomeBlockID = 230;
	public static int enchantmentID = 100;
	public static int entityID = 10000;
	public static boolean snowyWorld;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		snowyWorld = config.get("Options", "Allow for Snowy Worlds?", true).getBoolean(snowyWorld);
		
		config.load();
	}

	public static int addItem(String name)
	{
		itemID++;

		return config.get("Items", name, itemID).getInt();
	}

	public static int addBlock(String name)
	{
		blockID++;

		return config.get("Blocks", name, blockID).getInt();
	}
	
	public static int addBiomeBlock(String name)
	{
		biomeBlockID++;

		return config.get("Blocks", name, biomeBlockID).getInt();
	}

	public static int addEnchantment(String name)
	{
		enchantmentID++;

		return config.get("Enchantments", name, enchantmentID).getInt();
	}

	public static int addEntity(String name)
	{
		entityID++;

		return config.get("Entities", name, entityID).getInt() - 1;
	}
	
	public static void initPost()
	{
		config.save();
	}
}