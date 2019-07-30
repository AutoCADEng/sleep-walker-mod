package boi.eng.bad.sleepwalker.world.dimension.biome;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.gen.feature.structure.Structure;

public class BasicBiomeProvider extends BiomeProvider{
	private Biome biome;
    public BasicBiomeProvider(SingleBiomeProviderSettings settings) {
    	this.biome=settings.getBiome();
    }
	@Override
	public Biome getBiome(int x, int y) {
		// TODO Auto-generated method stub
		return this.biome;
	}

	@Override
	public Biome[] getBiomes(int x, int z, int width, int length, boolean cacheFlag) {
	       Biome[] biomes = new Biome[width * length];
	        Arrays.fill(biomes, 0, width * length, this.biome);
	        return biomes;
	}

	@Override
	public Set<Biome> getBiomesInSquare(int centerX, int centerZ, int sideLength) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override	
	public BlockPos findBiomePosition(int x, int z, int range, List<Biome> biomes, Random random) {
		return biomes.contains(this.biome) ? new BlockPos(x - range + random.nextInt(range * 2 + 1), 0, z - range + random.nextInt(range * 2 + 1)) : null;
	}

	@Override
	public boolean hasStructure(Structure<?> structureIn) {
		return false;
	}

	@Override
	public Set<BlockState> getSurfaceBlocks() {
		if (this.topBlocksCache.isEmpty()) {
			this.topBlocksCache.add(this.biome.getSurfaceBuilderConfig().getTop());
		}
		return this.topBlocksCache;
	}

}
