package net.skyrimcraft.mod.blocks;

import java.util.List;

import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.skyrimcraft.mod.Reference;
import net.skyrimcraft.mod.SkyrimCraft;

public class BlockWeaponRack extends BlockHorizontal {
	
	public BlockWeaponRack() {
		super(Material.IRON);
		setCreativeTab(SkyrimCraft.MAIN_TAB);
		setUnlocalizedName(Reference.SCBlocks.WEAPON_RACK.getUnlocalizedName());
		setRegistryName(Reference.SCBlocks.WEAPON_RACK.getRegistryName());
		setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
	}
	
	/*
	 * Gets direction of the player when the block is placed
	 */
	
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
		IBlockState state = super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
		return state.withProperty(FACING, placer.getHorizontalFacing());
	}
	
	/*
	 * Gets current state of block(In this case, direction is taken)
	 */
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(FACING).getHorizontalIndex();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, FACING);
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
}
