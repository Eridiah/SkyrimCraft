package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkFirebrandWine extends ItemDrink {

	public DrinkFirebrandWine() {
		super(0, 0, false);
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.FIREBRAND_WINE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.FIREBRAND_WINE.getRegistryName());
	}
	
}
