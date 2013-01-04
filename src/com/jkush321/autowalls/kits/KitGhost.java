package com.jkush321.autowalls.kits;

import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import com.jkush321.autowalls.Kit;

public class KitGhost implements Kit {

	ItemStack[] contents;
	
	public KitGhost()
	{
		Potion potion = new Potion(PotionType.INVISIBILITY);
		potion.setSplash(true);
		contents = new ItemStack[]{ potion.toItemStack(3) };
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
		return "Ghost";
	}

	@Override
	public boolean isDefault() {
		return false;
	}

}
