package com.jkush321.autowalls;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.Bukkit;
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
					TeleportManager.getPlayer(this).sendMessage("§eYou are being teleported to " + TeleportManager.getTarget(TeleportManager.getPlayer(this)).getDisplayName());
					TeleportManager.getPlayer(this).teleport(TeleportManager.getTarget(TeleportManager.getPlayer(this)));
				}
				else
				{
					TeleportManager.getPlayer(this).sendMessage("§cYour previous teleport was cancelled.");
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
