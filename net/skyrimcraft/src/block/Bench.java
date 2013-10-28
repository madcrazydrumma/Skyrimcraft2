package net.skyrimcraft.src.block;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.skyrimcraft.src.base.SkyrimcraftII;
import net.skyrimcraft.src.tileentity.TileEntityBench;
import net.skyrimcraft.src.tileentity.TileEntityCommonEndTable;

public class Bench extends BlockContainer
{
	public Bench(int i) {
		super(i, Material.wood);
		this.setCreativeTab(SkyrimcraftII.tab);
		setBlockBounds(-1.0F, 0.0F, 0.0F, 2.0F, 0.75F, 1.0F);
	}
	
	public int quanityDropped(Random random) {
		return 1;
	}

	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public TileEntity createNewTileEntity(World world) {
		return new TileEntityBench();
	}
}