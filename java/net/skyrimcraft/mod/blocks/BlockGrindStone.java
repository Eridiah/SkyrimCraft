package net.skyrimcraft.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class BlockGrindStone extends Block {

	public BlockGrindStone() {
		super(Material.WOOD);
		setCreativeTab(SkyrimCraft.CREATIVE_TAB);
		setUnlocalizedName(Reference.SCBlocks.GRIND_STONE.getUnlocalizedName());
		setRegistryName(Reference.SCBlocks.GRIND_STONE.getRegistryName());
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
}
