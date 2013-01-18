package com.jkush321.autowalls;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.inventory.ItemStack;

public class Grenades {
	public static ItemStack BASIC_GRENADE;
	
	public static void init()
	{
		BASIC_GRENADE = new ItemStack(Material.SNOW_BALL, 1);
		ItemUtils.setItemName(BASIC_GRENADE, ChatColor.RED + "Basic Grenade");
	}
	
	public static void handleLanding(ProjectileHitEvent e, Projectile proj)
	{
		if (WallDropper.time > 0)
		{
			Player player = (Player) proj.getShooter();
			player.sendMessage(ChatColor.RED + "Your grenade did not go off, the walls are still up.");
		}
		else if (e.getEntity().getMetadata("grenade-type").get(0).asString().equals("basic"))
		{
			e.getEntity().getWorld().createExplosion(e.getEntity().getLocation(), .8F);
		}
	}
}
