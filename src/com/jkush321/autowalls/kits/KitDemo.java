package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitDemo implements Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.REDSTONE_TORCH_ON, 8), new ItemStack(Material.TNT, 6) };
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 75;
	}

	@Override
	public String getName() {
		return "Demo";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
