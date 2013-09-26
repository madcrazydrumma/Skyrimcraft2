package net.skyrimcraft.src.base;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config
{
	public static Configuration config;
	public static int itemID;
	public static int blockID;
	public static boolean snowyWorld;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		snowyWorld = config.get("Options", "Allow for Snowy Worlds?", true).getBoolean(snowyWorld);
		itemID = config.get("Item ID", "Item Start ID", 9000).getInt();
		blockID = config.get("Block ID", "Block Start ID", 2000).getInt();
	}

	public void save() 
	{
		config.save();
	}
}