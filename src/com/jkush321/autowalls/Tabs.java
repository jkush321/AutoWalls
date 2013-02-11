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

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.mcsg.double0negative.tabapi.TabAPI;

public class Tabs {
	public static void updateTab(Player p)
	{
		if (AutoWalls.useTabApi)
		{
			try{
				TabAPI.clearTab(p);
				
				TabAPI.setTabString(AutoWalls.plugin, p, 0, 0, ChatColor.GREEN.toString() + ChatColor.BOLD + "Alive");
				TabAPI.setTabString(AutoWalls.plugin, p, 0, 1, ChatColor.RED.toString() + ChatColor.BOLD + "Dead");
				TabAPI.setTabString(AutoWalls.plugin, p, 0, 2, ChatColor.GRAY.toString() + ChatColor.BOLD + "Spectators");
				
				for (int i = 2; i < AutoWalls.playing.size()+2; i++)
				{
					if (AutoWalls.redTeam.contains(AutoWalls.playing.get(i-2))) TabAPI.setTabString(AutoWalls.plugin, p, i, 0, ChatColor.DARK_RED + AutoWalls.playing.get(i-2).getName());
					if (AutoWalls.blueTeam.contains(AutoWalls.playing.get(i-2))) TabAPI.setTabString(AutoWalls.plugin, p, i, 0, ChatColor.DARK_AQUA + AutoWalls.playing.get(i-2).getName());
					if (AutoWalls.greenTeam.contains(AutoWalls.playing.get(i-2))) TabAPI.setTabString(AutoWalls.plugin, p, i, 0, ChatColor.DARK_GREEN + AutoWalls.playing.get(i-2).getName());
					if (AutoWalls.orangeTeam.contains(AutoWalls.playing.get(i-2))) TabAPI.setTabString(AutoWalls.plugin, p, i, 0, ChatColor.GOLD + AutoWalls.playing.get(i-2).getName());
				}
				for (int i = 2; i < AutoWalls.dead.size() + 2; i++)
				{
					TabAPI.setTabString(AutoWalls.plugin, p, i, 1, ChatColor.BLACK + AutoWalls.dead.get(i-2));
				}
				int i = 2;
				for (Player player : Bukkit.getOnlinePlayers())
				{
					if (!AutoWalls.playing.contains(player) && !AutoWalls.dead.contains(player.getName()))
					{
						TabAPI.setTabString(AutoWalls.plugin, p, i, 2, player.getName());
						i++;
					}
				}
			}catch (Exception e)
			{
				e.printStackTrace();
			}
			TabAPI.updatePlayer(p);
		}
	}
	public static void updateAll()
	{
		if (AutoWalls.useTabApi)
		{
			for (Player p : Bukkit.getOnlinePlayers())
			{
				updateTab(p);
			}
		}
	}
	public static void addPlayer(Player p)
	{
		if (AutoWalls.useTabApi)
		{
			final Player pF = p;
			TabAPI.setPriority(AutoWalls.plugin, p, 1);
			Bukkit.getScheduler().scheduleSyncDelayedTask(AutoWalls.plugin, new Runnable(){
				public void run(){
					TabAPI.setPriority(AutoWalls.plugin, pF, 2);
					Tabs.updateAll();
				}
			}, 30);
		}
	}
	public static void removePlayer(Player p)
	{
		if (AutoWalls.useTabApi)
		{
			//nothing here right now, added as needed
		}
	}
}
