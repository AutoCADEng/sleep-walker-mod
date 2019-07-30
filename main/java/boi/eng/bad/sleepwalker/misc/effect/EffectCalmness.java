package boi.eng.bad.sleepwalker.misc.effect;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class EffectCalmness extends Effect {
	private static String name="calmness";
	public EffectCalmness() {
		super(EffectType.BENEFICIAL, 5335353);
		
		addAttributesModifier(
			SharedMonsterAttributes.MOVEMENT_SPEED,
			"fdd0a7ff-9cea-4b2c-8207-ae3bbb11d5b2",
			(double)-1.05f,
		AttributeModifier.Operation.MULTIPLY_TOTAL)
		.setRegistryName(SleepWalker.modid, name);
	}

}
