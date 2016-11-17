package net.skyrimcraft.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.skyrimcraft.mod.init.ModDrinks;
import net.skyrimcraft.mod.init.ModFoods;

public class DrinkTab extends CreativeTabs {

	public DrinkTab() {
		super("tabDrink");
	}
	
	@Override
	public Item getTabIconItem() {
		return ModDrinks.altoWine;
	}

}
