/*
 * AutoWalls by jkush321 is licensed under the
 * Creative Commons Attribution-NonCommercial 3.0 Unported License
 * 
 * You are fully allowed to modify the source code for your own network
 * of servers, but you may not distribute the modified code outside of
 * your servers.
 * 
 * AutoWalls was originally a personal project that was standalone for
 * my own private server, and it slowly accumulated into a giant plugin.
 * 
 * AutoWalls is for dedicated servers that are willing to run just Walls.
 * 
 * The license requires attribution and you have to give credit to jkush321
 * no matter how many changes were made to the code. In some clearly stated
 * way everyone who goes on the server must be able to easily see and be aware
 * of the fact that this code originated from jkush321 and was modified by
 * you or your team.
 * 
 * For more information visit http://bit.ly/AutoWalls
 * 
 */

package com.jkush321.autowalls.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import com.jkush321.autowalls.ItemUtils;


public class KitFirefighter extends Kit {

	ItemStack[] contents;
	
	public KitFirefighter()
	{
		ItemStack helm = new ItemStack(Material.LEATHER_HELMET, 1);
		helm = ItemUtils.dyeArmor(helm, 255, 255, 0);
		
		ItemStack chestPlate = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		chestPlate = ItemUtils.dyeArmor(chestPlate, 255, 0, 0);
		chestPlate.addEnchantment(Enchantment.PROTECTION_FIRE, 1);
		
		ItemStack sword = new ItemStack(Material.STONE_SWORD, 1);
		
		ItemStack bucket = new ItemStack(Material.WATER_BUCKET, 1);
		
		ItemStack ladders = new ItemStack(Material.LADDER, 25);
		
		contents = new ItemStack[]{ helm, chestPlate, sword, bucket, ladders };
	}
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 35;
	}

}
