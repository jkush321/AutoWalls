package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitBuilder implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.COBBLESTONE, 64), new ItemStack(Material.COBBLESTONE, 64), new ItemStack(98, 64), new ItemStack(98, 64), new ItemStack(Material.WOOD, 16) };
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 30;
	}

	@Override
	public String getName() {
		return "Builder";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
