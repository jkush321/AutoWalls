package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitTools implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.WOOD_PICKAXE, 1), new ItemStack(Material.WOOD_AXE, 1), new ItemStack(Material.WOOD_SPADE, 1), new ItemStack(Material.WOOD_SWORD, 1) };
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 0;
	}

	@Override
	public String getName() {
		return "Tools";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
