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


package com.jkush321.autowalls;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Color;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

public class ItemUtils {
	public static ItemStack setItemName(ItemStack stack, String name){
        ItemMeta m = stack.getItemMeta();
        m.setDisplayName(name);
        stack.setItemMeta(m);
        return stack;
    }
	
	public static ItemStack setLore(ItemStack stack, String... lore)
	{
		ItemMeta m = stack.getItemMeta();
		List<String> loreList = new ArrayList<String>();
		for (String s : lore)
		{	
			loreList.add(s);
		}
		m.setLore(loreList);
		stack.setItemMeta(m);
		return stack;
	}
	
	public static ItemStack dyeArmor(ItemStack stack, int r, int g, int b)
	{
		LeatherArmorMeta lam = (LeatherArmorMeta)stack.getItemMeta();
		lam.setColor(Color.fromRGB(r, g, b));
		stack.setItemMeta(lam);
		return stack;
	}
}
