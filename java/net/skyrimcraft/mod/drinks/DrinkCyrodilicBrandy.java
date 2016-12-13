package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkCyrodilicBrandy extends ItemDrink {

	public DrinkCyrodilicBrandy() {
		super(0, 0, false);
		setUnlocalizedName(Reference.SCDrinks.CYRODILIC_BRANDY.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.CYRODILIC_BRANDY.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
	}
	
}
