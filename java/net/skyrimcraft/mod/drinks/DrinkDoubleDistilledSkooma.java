package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkDoubleDistilledSkooma extends ItemDrink {

	public DrinkDoubleDistilledSkooma() {
		setUnlocalizedName(Reference.SCDrinks.DOUBLE_DISTILLED_SKOOMA.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.DOUBLE_DISTILLED_SKOOMA.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
	}
	
}
