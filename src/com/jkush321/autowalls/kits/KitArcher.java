package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitArcher implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.LEATHER_HELMET, 1), new ItemStack(Material.LEATHER_CHESTPLATE, 1), new ItemStack(Material.BOW, 1), new ItemStack(Material.ARROW, 12) };
	
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
		return "Archer";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
