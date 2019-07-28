package boi.eng.bad.sleepwalker.misc.effect;


import net.minecraft.potion.Effect;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModEffect{
	public static Effect CALMNESS = new EffectCalmness();
	public static Effect LUCIDITY = new EffectLucidity();
	public static Effect ANXIETY = new EffectAnxiety();
	public static Effect MEMORY = new EffectMemory();
	
	@SubscribeEvent
	public static void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().registerAll(
				CALMNESS,
				LUCIDITY,
				ANXIETY,
				MEMORY);
	}
} 
