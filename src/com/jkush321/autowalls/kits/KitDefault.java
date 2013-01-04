package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitDefault implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.EXP_BOTTLE, 4), new ItemStack(Material.STONE_PICKAXE, 1) };
	
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
		return "Default";
	}

	@Override
	public boolean isDefault() {
		return true;
	}

}
