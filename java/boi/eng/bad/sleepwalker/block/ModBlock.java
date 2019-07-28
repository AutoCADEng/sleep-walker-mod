package boi.eng.bad.sleepwalker.block;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModBlock {

	//BLOCKS
	public static Block cloudBlock = new CloudBlock();
	public static Block pillowBlock = new PillowBlock();
	
	
	
	//REGISTER BLOCKS
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				cloudBlock,
				pillowBlock
				);
	}
	
	
	//BLOCK ITEMS
	@SubscribeEvent
	public static void registerBlockItems(RegistryEvent.Register<Item> event) {
		registerItemBlock(
				event,
				cloudBlock,
				pillowBlock
				);
	}
	
	
	//MISC
    private static void registerItemBlock(RegistryEvent.Register<Item> event, Block... blocks) {
        for (int i = 0; i < blocks.length; i++) {
            event.getRegistry().register(new BlockItem(blocks[i], new Item.Properties().maxStackSize(64).group(SleepWalker.cTab)).setRegistryName(blocks[i].getRegistryName()));
        }
    }
}
