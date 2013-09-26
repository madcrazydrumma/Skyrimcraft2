package sheenrox82.skyrimcraft.src.world.gen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraft.world.chunk.IChunkProvider;
import sheenrox82.skyrimcraft.src.world.gen.feature.WorldGenPineTrees;
import cpw.mods.fml.common.IWorldGenerator;


public class WorldGenOverworld implements IWorldGenerator 
{
	public WorldGenOverworld() 
	{

	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId)
		{
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
		case 0:
			generateSurface(world, random, chunkX * 16, chunkZ * 16);
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	public int i;
	public int Xcoord;
	public int Ycoord;
	public int Zcoord;

	private void generateEnd(World world, Random rand, int blockX, int blockZ) 
	{
		
	}

	private void generateSurface(World world, Random rand, int blockX, int blockZ) 
	{

		BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);
		WorldGenPineTrees tree = new WorldGenPineTrees(false);

		if((biome instanceof BiomeGenPlains) || (biome instanceof BiomeGenHills)) 
		{
			for(int x = 0; x < 8; x++)
			{
				int i = blockX + rand.nextInt(16);
				int k = blockZ + rand.nextInt(16);
				int j = world.getHeightValue(i, k);
				tree.generate(world, rand, i, j, k);
			}
		}
	}
	
	private void generateNether(World world, Random rand, int blockX, int blockZ) 
	{
		
	}
}
