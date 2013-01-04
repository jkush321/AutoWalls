package com.jkush321.autowalls;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;

import com.jkush321.autowalls.kits.*;

public class KitManager {
	public static Map<Player, Kit> assignedKits = new HashMap<Player, Kit>();
	public static List<Kit> kits = new ArrayList<Kit>();
	
	public static void fillKits()
	{
		kits.add(new KitArcher());
		kits.add(new KitTools());
		kits.add(new KitDefault());
		kits.add(new KitMedic());
		kits.add(new KitWarrior());
		kits.add(new KitWarrior2());
		kits.add(new KitBuilder());
		kits.add(new KitDemo());
		kits.add(new KitFood());
		kits.add(new KitFood2());
		kits.add(new KitPyro());
		kits.add(new KitElite());
		kits.add(new KitParatrooper());
		kits.add(new KitCactus());
		kits.add(new KitGhost());
		kits.add(new KitTrader());
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
		for (Kit k : kits)
		{
			if (k.isDefault()) return k;
		}
		return null;
	}
	public static Kit findKit(String s)
	{
		for (Kit k : kits)
		{
			if (k.getName().equalsIgnoreCase(s)) return k;
		}
		return null;
	}
}
