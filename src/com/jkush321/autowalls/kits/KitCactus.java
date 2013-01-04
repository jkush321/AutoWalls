package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import com.jkush321.autowalls.Kit;

public class KitCactus implements Kit {

	ItemStack[] contents;
	
	public KitCactus()
	{
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS, 1);
		ItemStack legs = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		ItemStack chest = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		ItemStack helm = new ItemStack(Material.LEATHER_HELMET, 1);
		boots.addEnchantment(Enchantment.THORNS, 1);
		legs.addEnchantment(Enchantment.THORNS, 1);
		chest.addEnchantment(Enchantment.THORNS, 1);
		helm.addEnchantment(Enchantment.THORNS, 1);
		contents = new ItemStack[]{ boots, legs, chest, helm };
	}
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 15;
	}

	@Override
	public String getName() {
		return "Cactus";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
