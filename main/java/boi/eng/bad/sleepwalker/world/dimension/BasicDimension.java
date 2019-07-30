package boi.eng.bad.sleepwalker.world.dimension;

import java.util.function.BiFunction;

import boi.eng.bad.sleepwalker.world.dimension.biome.BasicBiomeProvider;
import boi.eng.bad.sleepwalker.world.dimension.biome.BasicChunkGenerator;
import net.minecraft.world.World;
import net.minecraft.world.biome.provider.BiomeProviderType;
import net.minecraft.world.biome.provider.SingleBiomeProviderSettings;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraftforge.common.ModDimension;

public class BasicDimension extends ModDimension{
	public static ChunkGeneratorType<GenerationSettings, BasicChunkGenerator> generatorType = new ChunkGeneratorType<>(BasicChunkGenerator::new, false, GenerationSettings::new);
    public static BiomeProviderType<SingleBiomeProviderSettings, BasicBiomeProvider> biomeProviderType = new BiomeProviderType<>(BasicBiomeProvider::new, SingleBiomeProviderSettings::new);
    
	@Override
	public BiFunction<World, DimensionType, ? extends Dimension> getFactory() {
		return BasicEmptyDimension::new;
	}

}
