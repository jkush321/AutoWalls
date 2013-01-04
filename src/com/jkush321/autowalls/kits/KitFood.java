package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitFood implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.COOKED_BEEF, 12) };
	
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
		return "Food";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
