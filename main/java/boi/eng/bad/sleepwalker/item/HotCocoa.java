package boi.eng.bad.sleepwalker.item;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;

public class HotCocoa extends Item{
	private String name="hot_cocoa";
	public HotCocoa() {
		super(
				new Properties()
				.group(SleepWalker.cTab)
				.maxStackSize(64)
				.food(
						new Food.Builder()
						.saturation(3f)
						.hunger(1)
						.setAlwaysEdible()
						.effect(
								new EffectInstance(Effects.GLOWING,240,2),1f)
						.build()
					)
				);
		setRegistryName(new ResourceLocation(SleepWalker.modid,name));
		// TODO Auto-generated constructor stub
	}
	
}
