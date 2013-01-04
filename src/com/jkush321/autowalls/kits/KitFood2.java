package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitFood2 implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.COOKED_BEEF, 64), new ItemStack(Material.GOLDEN_APPLE, 4) };
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 50;
	}

	@Override
	public String getName() {
		return "Food2";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
