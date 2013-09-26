package sheenrox82.skyrimcraft.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class SkyrimPlant extends Block
{
	Item itemDropped = Item.seeds;
	
	public SkyrimPlant(int par1, Item par2Item)
	{
		super(par1, Material.plants);
		itemDropped = par2Item;
	}
	
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }
    
    @Override
    public int getRenderType()
    {
        return 6;
    }
    
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, int neighborId)
    {
        if (!canBlockStay(world, x, y, z))
        {
            dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlock(x, y, z, 0);
        }
    }
    
    @Override
    public boolean canBlockStay(World world, int x, int y, int z)
    {
        Block soil = blocksList[world.getBlockId(x, y - 1, z)];
        return (world.getFullBlockLightValue(x, y, z) >= 8 || world.canBlockSeeTheSky(x, y, z)) && (soil.equals(Block.grass.blockID) || soil.equals(Block.dirt.blockID));
    }
    
    @Override
    public int idDropped(int metadata, Random random, int par2)
    {
        return itemDropped.itemID;
    }
    
    @Override
    public int idPicked(World world, int x, int y, int z)
    {
        return itemDropped.itemID;
    }
}