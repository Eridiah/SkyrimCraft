package net.skyrimcraft.mod.drinks;

import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkWhitegoldTower extends ItemDrink {

	public DrinkWhitegoldTower() {
		setCreativeTab(SkyrimCraft.DRINK_TAB);
		setUnlocalizedName(Reference.SCDrinks.WHITE_GOLD_TOWER.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.WHITE_GOLD_TOWER.getRegistryName());
	}
	
}
