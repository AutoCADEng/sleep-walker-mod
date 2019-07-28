package boi.eng.bad.sleepwalker.item;

import org.apache.logging.log4j.Level;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import boi.eng.bad.sleepwalker.world.dimension.BasicDimension;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DreamJournal extends Item{
	private String name="dream_journal";
	public DreamJournal() {
		super(new Properties().group(SleepWalker.cTab).maxStackSize(1));
		setRegistryName(new ResourceLocation(SleepWalker.modid,name));
	}
	

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
		DimensionType dimension=DimensionManager.registerDimension(new ResourceLocation(SleepWalker.modid,"testdim"), new BasicDimension(), new PacketBuffer(null), true);
		DimensionManager.initWorld(player.getServer(), dimension);
		player.changeDimension(dimension);
        return new ActionResult<ItemStack>(ActionResultType.PASS, player.getHeldItem(hand));
	}
}
