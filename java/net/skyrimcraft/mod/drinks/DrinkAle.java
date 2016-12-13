package net.skyrimcraft.mod.drinks;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;
import net.skyrimcraft.mod.items.ItemDrink;

public class DrinkAle extends ItemDrink {

	public DrinkAle() {
		super(0, 0, false);
		setUnlocalizedName(Reference.SCDrinks.ALE.getUnlocalizedName());
		setRegistryName(Reference.SCDrinks.ALE.getRegistryName());
		setCreativeTab(SkyrimCraft.DRINK_TAB);
	}
	
}
