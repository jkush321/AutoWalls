package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitElite implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.DIAMOND_SWORD, 1), new ItemStack(Material.COOKED_BEEF, 12), new ItemStack(Material.DIAMOND_HELMET, 1), new ItemStack(Material.DIAMOND_CHESTPLATE, 1), new ItemStack(Material.CHAINMAIL_LEGGINGS, 1), new ItemStack(Material.GOLD_BOOTS, 1), new ItemStack(Material.GOLDEN_APPLE, 2), new ItemStack(Material.IRON_PICKAXE, 1), new ItemStack(Material.EXP_BOTTLE, 1) };
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 250;
	}

	@Override
	public String getName() {
		return "Elite";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
