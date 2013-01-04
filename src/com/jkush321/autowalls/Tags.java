package com.jkush321.autowalls;

import org.kitteh.tag.TagAPI;
import org.bukkit.entity.Player;

public class Tags {
	public static boolean useTagAPI = false;
	
	public static void refreshPlayer(Player p)
	{
		if (useTagAPI)
		{
			TagAPI.refreshPlayer(p);
		}
		else return;
	}
}
