package boi.eng.bad.sleepwalker.misc.effect;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class EffectLucidity extends Effect {
	private static String name="lucidity";
	public EffectLucidity() {
		super(EffectType.BENEFICIAL, 2312314);
		setRegistryName(SleepWalker.modid, name);
	}

}
