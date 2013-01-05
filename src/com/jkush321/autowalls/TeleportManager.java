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

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class TeleportManager {
	private static Map<Player, Runnable> runnables = new HashMap<>();
	private static Map<Runnable, Player> runnableOwnership = new HashMap<>();
	private static Map<Player, Player> tpTargets = new HashMap<>();
	
	public static Runnable getRunnable(Player p)
	{
		if (runnables.containsKey(p)) return runnables.get(p);
		return null;
	}
	public static Player getPlayer(Runnable r)
	{
		if (runnableOwnership.containsKey(r)) return runnableOwnership.get(r);
		return null;
	}
	public static Player getTarget(Player p)
	{
		if (tpTargets.containsKey(p))
		{
			return tpTargets.get(p);
		}
		return null;
	}
	public static void createTpRunnable(Player p, Player target)
	{
		Runnable runnable = new Runnable(){
			public void run(){
				if (AutoWalls.getTicksFromLastEvent(TeleportManager.getPlayer(this)) * 20 >= AutoWalls.secondsBeforeTeleport)
				{
					TeleportManager.getPlayer(this).sendMessage(ChatColor.YELLOW + "You are being teleported to " + TeleportManager.getTarget(TeleportManager.getPlayer(this)).getDisplayName());
					TeleportManager.getPlayer(this).teleport(TeleportManager.getTarget(TeleportManager.getPlayer(this)));
				}
				else
				{
					TeleportManager.getPlayer(this).sendMessage(ChatColor.RED + "Your previous teleport was cancelled.");
				}
			};
		};
		Bukkit.getScheduler().scheduleSyncDelayedTask(AutoWalls.plugin, runnable, AutoWalls.secondsBeforeTeleport * 20);
		runnableOwnership.put(runnable, p);
		if (runnables.containsKey(p)) runnables.remove(p);
		runnables.put(p, runnable);
		if (tpTargets.containsKey(p)) tpTargets.remove(p);
		tpTargets.put(p, target);
	}
}
