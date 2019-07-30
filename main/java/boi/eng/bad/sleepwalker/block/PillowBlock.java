package boi.eng.bad.sleepwalker.block;

import javax.annotation.Nullable;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;

public class PillowBlock extends Block{
	
	private String name = "pillow_block";
	public PillowBlock() {
		super(Properties
				.create(Material.WOOL)
				.sound(SoundType.CLOTH)
				.hardnessAndResistance(1f, 1f)
				.lightValue(0/16)
				.variableOpacity()
				);
		setRegistryName(new ResourceLocation(SleepWalker.modid,name));
	}

	@Nullable
	@Override
	public ToolType	getHarvestTool(BlockState blockstate) {
		return null;
	}
    @Override
    public int getHarvestLevel(BlockState blockstate) {
        return 1;
    }
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.SOLID;
    }
}	
