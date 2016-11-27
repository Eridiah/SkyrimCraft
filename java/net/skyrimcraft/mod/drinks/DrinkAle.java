package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkAle extends ItemDrink {

	public DrinkAle() {
		setUnlocalizedName(Reference.SCDrinks.ALE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.ALE.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
	}
	
}
