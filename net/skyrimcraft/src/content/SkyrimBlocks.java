package net.skyrimcraft.src.content;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.skyrimcraft.src.base.Config;
import net.skyrimcraft.src.base.SkyrimRegistry;
import net.skyrimcraft.src.block.SkyrimAnvil;
import net.skyrimcraft.src.block.SkyrimBlock;

public class SkyrimBlocks 
{
	public static int id = Config.blockID;
	
	public static final Block anvil = new SkyrimAnvil(getNextBlockNum()).setUnlocalizedName("Anvil");
	public static final Block ebonyOre = new SkyrimBlock(getNextBlockNum(), Material.iron).setUnlocalizedName("EbonyOre");
	public static final Block malachiteOre = new SkyrimBlock(getNextBlockNum(), Material.iron).setUnlocalizedName("MalachiteOre");
	public static final Block moonstoneOre = new SkyrimBlock(getNextBlockNum(), Material.iron).setUnlocalizedName("MoonstoneOre");

	public static void add()
	{
		SkyrimRegistry.registerBlock(anvil, "Anvil");
		SkyrimRegistry.registerBlock(ebonyOre, "Ebony Ore");
		SkyrimRegistry.registerBlock(malachiteOre, "Malachite Ore");
		SkyrimRegistry.registerBlock(moonstoneOre, "Moonstone Ore");
	}
	
	public static int getNextBlockNum()
	{
		return id++;
	}
}
