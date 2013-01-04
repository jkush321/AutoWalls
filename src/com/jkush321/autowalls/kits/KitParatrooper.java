package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitParatrooper implements Kit {

	ItemStack[] contents;
	
	public KitParatrooper()
	{
		ItemStack boots = new ItemStack(Material.GOLD_BOOTS, 1);
		boots.addEnchantment(Enchantment.PROTECTION_FALL, 4);
		contents = new ItemStack[]{ boots };
	}
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 5;
	}

	@Override
	public String getName() {
		return "Paratrooper";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
