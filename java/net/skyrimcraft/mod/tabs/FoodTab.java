package net.skyrimcraft.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.skyrimcraft.mod.init.ModFoods;

public class FoodTab extends CreativeTabs {

	public FoodTab() {
		super("tabFood");
	}
	
	@Override
	public Item getTabIconItem() {
		return ModFoods.tomato;
	}
	
}
