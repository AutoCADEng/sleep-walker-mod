package boi.eng.bad.sleepwalker.item;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModItem {

	public static Item dreamJournal=new DreamJournal();
	public static Item hotCocoa=new HotCocoa();
	public static Item pouch=new Pouch();
	public static Item pocket_nether_portal=new NetherPortal();
	public static Item pocket_end_portal=new EndPortal();
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				dreamJournal,
				hotCocoa,
				pouch,
				pocket_nether_portal,
				pocket_end_portal
	);
	}
}
