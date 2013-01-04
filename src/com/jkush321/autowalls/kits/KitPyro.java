package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitPyro implements Kit {

	ItemStack[] contents;
	
	public KitPyro()
	{
		ItemStack helm = new ItemStack(Material.DIAMOND_HELMET, 1);
		helm.addEnchantment(Enchantment.PROTECTION_FIRE, 2);
		ItemStack fireSword = new ItemStack(Material.IRON_SWORD, 1);
		fireSword.addEnchantment(Enchantment.FIRE_ASPECT, 1);
		contents = new ItemStack[]{ helm, fireSword };
	}
	
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
		return "Pyro";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
