package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkFirebrandWine extends ItemDrink {

	public DrinkFirebrandWine() {
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.FIREBRAND_WINE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.FIREBRAND_WINE.getRegistryName());
	}
	
}
