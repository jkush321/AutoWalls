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

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.kitteh.tag.PlayerReceiveNameTagEvent;

public class ColoredNames implements Listener {
	@EventHandler
	public void onNameTag(PlayerReceiveNameTagEvent event) {
		if (AutoWalls.playing.contains(event.getNamedPlayer()))
		{
			if (AutoWalls.redTeam.contains(event.getNamedPlayer()))
			{
				event.setTag(ChatColor.DARK_RED + event.getNamedPlayer().getName());
			}else if (AutoWalls.blueTeam.contains(event.getNamedPlayer()))
			{
				event.setTag(ChatColor.DARK_AQUA + event.getNamedPlayer().getName());
			}else if (AutoWalls.orangeTeam.contains(event.getNamedPlayer()))
			{
				event.setTag(ChatColor.GOLD + event.getNamedPlayer().getName());
			}else if (AutoWalls.greenTeam.contains(event.getNamedPlayer()))
			{
				event.setTag(ChatColor.DARK_GREEN + event.getNamedPlayer().getName());
			}
			if (ColorCycler.getFakeColor(event.getNamedPlayer()) != null) event.setTag(ColorCycler.getFakeColor(event.getNamedPlayer()) + event.getNamedPlayer().getName());
		}
	}
}
