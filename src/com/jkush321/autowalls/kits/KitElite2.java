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
import org.bukkit.inventory.ItemStack;


public class KitElite2 extends Kit {

	ItemStack[] contents = new ItemStack[]{ new ItemStack(Material.DIAMOND_SWORD, 1), new ItemStack(Material.COOKED_BEEF, 12), new ItemStack(Material.DIAMOND_HELMET, 1), new ItemStack(Material.DIAMOND_CHESTPLATE, 1), new ItemStack(Material.CHAINMAIL_LEGGINGS, 1), new ItemStack(Material.GOLD_BOOTS, 1), new ItemStack(Material.GOLDEN_APPLE, 2), new ItemStack(Material.IRON_PICKAXE, 1), new ItemStack(Material.EXP_BOTTLE, 16) };
	
	public KitElite2()
	{
		ItemStack boots = new ItemStack(Material.DIAMOND_BOOTS);
		ItemStack legs = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemStack chest = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemStack helm = new ItemStack(Material.DIAMOND_HELMET);
		
		ItemStack sword = new ItemStack(Material.DIAMOND_SWORD);
		ItemStack pickaxe = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemStack axe = new ItemStack(Material.DIAMOND_AXE);
		
		ItemStack exp = new ItemStack(Material.EXP_BOTTLE, 64);
		ItemStack bookshelves = new ItemStack(Material.BOOKSHELF, 16);
		ItemStack anvil = new ItemStack(Material.ANVIL);
		
		ItemStack flintAndSteel = new ItemStack(Material.FLINT_AND_STEEL);
		
		ItemStack coal = new ItemStack(Material.COAL, 16);
		
		contents = new ItemStack[]{ sword, pickaxe, axe, helm, chest, legs, boots, exp, bookshelves, anvil, flintAndSteel, coal };
	}
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 450;
	}

}
