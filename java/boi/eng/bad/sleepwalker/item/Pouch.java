package boi.eng.bad.sleepwalker.item;

import org.apache.logging.log4j.Level;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Pouch extends Item{
	private String name="pouch";
	public Pouch() {
		super(
				new Properties()
				.group(SleepWalker.cTab)
				.maxStackSize(1)
				);
		setRegistryName(new ResourceLocation(SleepWalker.modid,name));
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		SleepWalker.logger.log(Level.WARN, "Sleep Walker: Pouch RCLICK!");
        return new ActionResult<ItemStack>(ActionResultType.PASS, playerIn.getHeldItem(handIn));
		
	}
}
