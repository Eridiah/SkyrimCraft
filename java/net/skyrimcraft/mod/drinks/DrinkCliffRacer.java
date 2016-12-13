package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkCliffRacer extends ItemDrink {

	public DrinkCliffRacer() {
		super(0, 0, false);
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.CLIFF_RACER.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.CLIFF_RACER.getRegistryName());
	}
	
}
