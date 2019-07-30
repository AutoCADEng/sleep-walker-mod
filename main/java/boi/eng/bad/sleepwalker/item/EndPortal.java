package boi.eng.bad.sleepwalker.item;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class EndPortal extends Item{
	private String name="pocket_end_portal";
	public EndPortal() {
		super(new Properties().group(SleepWalker.cTab).maxStackSize(1));
		setRegistryName(new ResourceLocation(SleepWalker.modid,name));
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
		if (player.dimension!=DimensionType.THE_END) {
			player.changeDimension(DimensionType.THE_END);	
		}else{
			player.changeDimension(DimensionType.OVERWORLD);	
		}
        return new ActionResult<ItemStack>(ActionResultType.PASS, player.getHeldItem(hand));
	}
}
