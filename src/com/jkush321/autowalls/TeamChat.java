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
import static com.jkush321.autowalls.AutoWalls.*;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class TeamChat {
	public static List<Player> teamChatting = new ArrayList<Player>();
	
	// Return = Normal Chat Canceled (True if talking to only a certain group)
	public static boolean say(Player p, String message)
	{
		if (!playing.contains(p))
		{
			sayToTeam(message, 4);
		}
		else
		{
			if (teamChatting.contains(p))
			{
				if (redTeam.contains(p))
				{
					sayToTeam(message,0);
				}
				else if (blueTeam.contains(p))
				{
					sayToTeam(message,1);
				}
				else if (greenTeam.contains(p))
				{
					sayToTeam(message,2);
				}
				else if (orangeTeam.contains(p))
				{
					sayToTeam(message,3);
				}
			}
			else sayToTeam(message,5);
		}
		return true;
	}
	public static void sayToTeam(String message, int team) //red = 0; blue = 1; green = 2; orange = 3; 4 = spectators; other = global;
	{
		if (team==0)
		{
			for (Player p : Bukkit.getOnlinePlayers())
			{
				if (!playing.contains(p) || redTeam.contains(p))
					p.sendMessage("§e<§cRedChat§e>§f" + message);
			}
		}
		else if (team==1)
		{
			for (Player p : Bukkit.getOnlinePlayers())
			{
				if (!playing.contains(p) || blueTeam.contains(p))
					p.sendMessage("§e<§cBlueChat§e>§f" + message);
			}
		}
		else if (team==2)
		{
			for (Player p : Bukkit.getOnlinePlayers())
			{
				if (!playing.contains(p) || greenTeam.contains(p))
					p.sendMessage("§e<§cGreenChat§e>§f" + message);
			}
		}
		else if (team==3)
		{
			for (Player p : Bukkit.getOnlinePlayers())
			{
				if (!playing.contains(p) || orangeTeam.contains(p))
					p.sendMessage("§e<§cOrangeChat§e>§f" + message);
			}
		}
		else if (team==4)
		{
			for (Player p : Bukkit.getOnlinePlayers())
			{
				if (!playing.contains(p))
					p.sendMessage("§e<§cSpecChat§e>§f" + message);
			}
		}
		else
		{
			Bukkit.broadcastMessage("§e<§cGlobalChat§e>§f" + message);
		}
	}
}