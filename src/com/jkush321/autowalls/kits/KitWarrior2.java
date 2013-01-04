package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitWarrior2 implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.DIAMOND_SWORD, 1), new ItemStack(Material.COOKED_BEEF, 4), new ItemStack(Material.IRON_HELMET, 1), new ItemStack(Material.IRON_CHESTPLATE, 1), new ItemStack(Material.GOLD_BOOTS, 1) };
	
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
		return "Warrior2";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
