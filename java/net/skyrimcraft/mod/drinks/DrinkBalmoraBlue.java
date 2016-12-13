package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkBalmoraBlue extends ItemDrink {

	public DrinkBalmoraBlue() {
		super(0, 0, false);
		setUnlocalizedName(Reference.SCDrinks.BALMORA_BLUE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.BALMORA_BLUE.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
	}
	
}
