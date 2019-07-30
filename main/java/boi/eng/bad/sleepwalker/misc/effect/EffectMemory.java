package boi.eng.bad.sleepwalker.misc.effect;

import boi.eng.bad.sleepwalker.core.SleepWalker;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class EffectMemory extends Effect {
	private static String name="memory";
	public EffectMemory() {
		super(EffectType.BENEFICIAL, 5355354);
		setRegistryName(SleepWalker.modid, name);
	}

}
