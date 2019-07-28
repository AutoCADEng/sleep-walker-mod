package boi.eng.bad.sleepwalker.misc.effect;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class EffectAnxiety extends Effect {
	private static String name="anxiety";
	public EffectAnxiety() {
		super(EffectType.HARMFUL, 2312314);
		
		addAttributesModifier(
			SharedMonsterAttributes.FOLLOW_RANGE,
			"42d0b3e1-4c79-4306-b93c-e7843465a9c4",
			(double) 2.0f,
		AttributeModifier.Operation.MULTIPLY_TOTAL)
		.setRegistryName(SleepWalker.modid, name);
	}

}
