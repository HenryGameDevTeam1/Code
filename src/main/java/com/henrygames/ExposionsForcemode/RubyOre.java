package com.henrygames.ExposionsForcemode;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class RubyOre extends Block {

	public RubyOre(int id, Material mat ){
		super(mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg){
		this.blockIcon = reg.registerIcon("explosionsforce:RubyOre");
	}
	
	}


