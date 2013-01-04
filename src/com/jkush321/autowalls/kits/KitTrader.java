package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.SpawnEgg;

import com.jkush321.autowalls.Kit;

public class KitTrader implements Kit {

	ItemStack[] contents;
	
	public KitTrader()
	{
		ItemStack emerald = new ItemStack(Material.EMERALD, 32);
		SpawnEgg egg = new SpawnEgg();
		egg.setSpawnedType(EntityType.VILLAGER);
		contents = new ItemStack[]{ emerald, egg.toItemStack(6) };
	}
	
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
		return "Trader";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
