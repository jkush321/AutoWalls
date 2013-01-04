package com.jkush321.autowalls;

import org.bukkit.inventory.ItemStack;

public interface Kit {
	public ItemStack[] getItemStack();
	public int getRequiredPriority();
	public String getName();
	public boolean isDefault();
}
