package net.skyrimcraft.src.content;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.skyrimcraft.src.base.Config;
import net.skyrimcraft.src.base.SkyrimRegistry;
import net.skyrimcraft.src.block.Bench;
import net.skyrimcraft.src.block.Bookshelf;
import net.skyrimcraft.src.block.CommonEndTable;
import net.skyrimcraft.src.block.Crate;
import net.skyrimcraft.src.block.SkyrimAnvil;
import net.skyrimcraft.src.block.SkyrimBlock;

public class SkyrimBlocks 
{
	public static final Block anvil = new SkyrimAnvil(Config.addBlock("Anvil")).setUnlocalizedName("anvil");
	public static final Block ebonyOre = new SkyrimBlock(Config.addBlock("Ebony Ore"), Material.iron).setUnlocalizedName("ebonyOre");
	public static final Block malachiteOre = new SkyrimBlock(Config.addBlock("Malachite Ore"), Material.iron).setUnlocalizedName("malachiteOre");
	public static final Block moonstoneOre = new SkyrimBlock(Config.addBlock("Moonstone Ore"), Material.iron).setUnlocalizedName("moonstoneOre");
	
	public static final Block wall1 = new SkyrimBlock(Config.addBlock("Wall"), Material.rock).setUnlocalizedName("wall1");
	
	public static final Block commonEndTable = new CommonEndTable(Config.addBlock("Common End Table")).setUnlocalizedName("commonEndTable");
	public static final Block bench = new Bench(Config.addBlock("Bench")).setUnlocalizedName("bench");
	public static final Block crate = new Crate(Config.addBlock("Crate")).setUnlocalizedName("crate");
	public static final Block bookshelf = new Bookshelf(Config.addBlock("Bookshelf")).setUnlocalizedName("bookshelf");
	
	public static void add()
	{
		SkyrimRegistry.registerBlock(anvil, "Anvil");
		SkyrimRegistry.registerBlock(ebonyOre, "Ebony Ore");
		SkyrimRegistry.registerBlock(malachiteOre, "Malachite Ore");
		SkyrimRegistry.registerBlock(moonstoneOre, "Moonstone Ore");
		SkyrimRegistry.registerBlock(wall1, "Wall");
		SkyrimRegistry.registerBlock(commonEndTable, "Common End Table");
		SkyrimRegistry.registerBlock(bench, "Bench");
		SkyrimRegistry.registerBlock(crate, "Crate");
		SkyrimRegistry.registerBlock(bookshelf, "Bookshelf");
	}
}
