package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkSpicedWine extends ItemDrink {

	public DrinkSpicedWine() {
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.SPICED_WINE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.SPICED_WINE.getRegistryName());
	}
	
}
