package boi.eng.bad.sleepwalker.misc;

import boi.eng.bad.sleepwalker.item.ModItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTabs extends ItemGroup{

	public CreativeTabs() {
		super("sleepwalkertab");
	}

	@Override
	public ItemStack createIcon() {
		// TODO Auto-generated method stub
		return new ItemStack(ModItem.dreamJournal);
	}

}
