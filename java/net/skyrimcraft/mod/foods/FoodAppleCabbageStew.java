package net.skyrimcraft.mod.foods;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class FoodAppleCabbageStew extends ItemFood {

	public FoodAppleCabbageStew() {
		super(4, 0.5F, false);
		setCreativeTab(SkyrimCraft.FOOD_TAB);
		setUnlocalizedName(Reference.SCFoods.APPLE_CABBAGE_STEW.getUnlocalizedName());
		setRegistryName(Reference.SCFoods.APPLE_CABBAGE_STEW.getRegistryName());
		setMaxStackSize(1);
	}
	
    @Nullable
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        super.onItemUseFinish(stack, worldIn, entityLiving);
        return new ItemStack(Items.BOWL);
    }

}
