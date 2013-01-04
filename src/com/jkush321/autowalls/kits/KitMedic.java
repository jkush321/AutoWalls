package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitMedic implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.POTION, 8, (short)16421), new ItemStack(Material.COOKED_BEEF, 8) };
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 10;
	}

	@Override
	public String getName() {
		return "Medic";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
