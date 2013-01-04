package com.jkush321.autowalls;

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
				event.setTag("§4" + event.getNamedPlayer().getName());
			}else if (AutoWalls.blueTeam.contains(event.getNamedPlayer()))
			{
				event.setTag("§3" + event.getNamedPlayer().getName());
			}else if (AutoWalls.orangeTeam.contains(event.getNamedPlayer()))
			{
				event.setTag("§6" + event.getNamedPlayer().getName());
			}else if (AutoWalls.greenTeam.contains(event.getNamedPlayer()))
			{
				event.setTag("§2" + event.getNamedPlayer().getName());
			}
		}
		else if (event.getPlayer().isOp()) event.setTag("§8" + event.getNamedPlayer().getName());
	}
}
