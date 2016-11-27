package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkStrosMkaiRum extends ItemDrink {

	public DrinkStrosMkaiRum() {
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.STROS_MKAI_RUM.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.STROS_MKAI_RUM.getRegistryName());
	}
	
}
