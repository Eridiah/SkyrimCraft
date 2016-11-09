package net.skyrimcraft.mod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.skyrimcraft.mod.blocks.BlockGrindStone;
import net.skyrimcraft.mod.blocks.BlockWeaponRack;

public class ModBlocks {

	public static Block weaponRack;
	public static Block grindStone;
	
	public static void init() {
		weaponRack = new BlockWeaponRack();
		grindStone = new BlockGrindStone();
	}
	
	public static void register() {
		registerBlock(weaponRack);
		registerBlock(grindStone);
	}
	
	/*
	 * Since blocks now have two versions, Blocks and ItemBlocks, this combines all of the code into one method so that creating blocks is much simpler.
	 */
	
	public static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(weaponRack);
		registerRender(grindStone);
	}
	
	/*
	 * Allows Minecraft to find the location of the Renderer so that it will show up properly in game
	 */
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
}
