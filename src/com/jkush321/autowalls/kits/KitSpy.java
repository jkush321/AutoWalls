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

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionType;

import com.jkush321.autowalls.ColorCycler;
import com.jkush321.autowalls.ItemUtils;


public class KitSpy extends Kit {

	ItemStack[] contents;
	
	public KitSpy()
	{
		Potion potion = new Potion(PotionType.INVISIBILITY);
		
		ItemStack colorCycler = new ItemStack(Material.NETHER_STAR);
		colorCycler = ItemUtils.setItemName(colorCycler, ChatColor.GREEN + "Color Cycler");
		colorCycler = ItemUtils.setLore(colorCycler, ChatColor.YELLOW + "Cycle through the nameplate colors", ChatColor.YELLOW + "by right clicking and look like", ChatColor.YELLOW + "whatever team you desire!", ChatColor.RED + "You have " + ColorCycler.MAX_COLOR_TIME + " secs total disguise time!");
		
		contents = new ItemStack[]{ potion.toItemStack(2), colorCycler };
	}
	
	@Override
	public ItemStack[] getItemStack() {
		return contents;
	}

	@Override
	public int getRequiredPriority() {
		return 150;
	}

}
