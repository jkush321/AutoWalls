package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitWarrior implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.IRON_SWORD, 1), new ItemStack(Material.CHAINMAIL_HELMET, 1), new ItemStack(Material.GOLD_CHESTPLATE, 1) };
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 25;
	}

	@Override
	public String getName() {
		return "Warrior";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
