package net.skyrimcraft.mod.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {

	public static void register() {
		GameRegistry.addRecipe(new ItemStack(ModFoods.appleCabbageStew), "SA", "C", "B", 'S', ModIngredients.saltPile ,'A', Items.APPLE, 'C', ModFoods.cabbage, 'B', Items.BOWL);
	}
	
}
