package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkColovianBrandy extends ItemDrink {

	public DrinkColovianBrandy() {
		setUnlocalizedName(Reference.SCDrinks.COLOVIAN_BRANDY.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.COLOVIAN_BRANDY.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
	}
	
}
