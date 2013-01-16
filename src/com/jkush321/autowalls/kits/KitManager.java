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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;

import com.jkush321.autowalls.AutoWalls;

public class KitManager {
	public static Map<Player, Kit> assignedKits = new HashMap<Player, Kit>();
	public static List<Kit> kitList = new ArrayList<Kit>();
	
	public static void fillKits()
	{
		kitList.add(new KitArcher());
		kitList.add(new KitBuilder());
		kitList.add(new KitBuilder2());
		kitList.add(new KitCactus());
		kitList.add(new KitDefault());
		kitList.add(new KitDemo());
		kitList.add(new KitElite());
		kitList.add(new KitElite2());
		kitList.add(new KitExcavator());
		kitList.add(new KitFarmer());
		kitList.add(new KitFood());
		kitList.add(new KitFood2());
		kitList.add(new KitGhost());
		kitList.add(new KitGhost2());
		kitList.add(new KitGhost3());
		kitList.add(new KitMedic());
		kitList.add(new KitMiner());
		kitList.add(new KitParatrooper());
		kitList.add(new KitPyro());
		kitList.add(new KitPyro2());
		kitList.add(new KitSmelter());
		kitList.add(new KitSpy());
		kitList.add(new KitTools());
		kitList.add(new KitTrader());
		kitList.add(new KitWarrior());
		kitList.add(new KitWarrior2());
		kitList.add(new KitWarrior3());
	}
	
	public static void setKit(Player p, Kit k)
	{
		if (assignedKits.containsKey(p)) assignedKits.remove(p);
		assignedKits.put(p, k);
	}
	/**
	 * NOTE: Null if game in progress
	 */
	public static Kit getKit(Player p)
	{
		if (AutoWalls.gameInProgress) return null;
		if (assignedKits.containsKey(p)) return assignedKits.get(p);
		for (Kit k : kitList)
		{
			if (k.isDefault()) return k;
		}
		return null;
	}
	public static Kit findKit(String s)
	{
		for (Kit k : kitList)
		{
			if (k.getName().equalsIgnoreCase(s)) return k;
		}
		return null;
	}
}
