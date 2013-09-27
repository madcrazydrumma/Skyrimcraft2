package net.skyrimcraft.src.content;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.skyrimcraft.src.base.Config;
import net.skyrimcraft.src.base.SkyrimRegistry;
import net.skyrimcraft.src.block.SkyrimAnvil;
import net.skyrimcraft.src.block.SkyrimBlock;

public class SkyrimBlocks 
{
	public static final Block anvil = new SkyrimAnvil(Config.addBlock("Anvil")).setUnlocalizedName("Anvil");
	public static final Block ebonyOre = new SkyrimBlock(Config.addBlock("Ebony Ore"), Material.iron).setUnlocalizedName("EbonyOre");
	public static final Block malachiteOre = new SkyrimBlock(Config.addBlock("Malachite Ore"), Material.iron).setUnlocalizedName("MalachiteOre");
	public static final Block moonstoneOre = new SkyrimBlock(Config.addBlock("Moonstone Ore"), Material.iron).setUnlocalizedName("MoonstoneOre");
	
	public static final Block wall1 = new SkyrimBlock(Config.addBlock("Wall"), Material.rock).setUnlocalizedName("wall1");
	
	public static void add()
	{
		SkyrimRegistry.registerBlock(anvil, "Anvil");
		SkyrimRegistry.registerBlock(ebonyOre, "Ebony Ore");
		SkyrimRegistry.registerBlock(malachiteOre, "Malachite Ore");
		SkyrimRegistry.registerBlock(moonstoneOre, "Moonstone Ore");
		SkyrimRegistry.registerBlock(wall1, "Wall");
	}
}
