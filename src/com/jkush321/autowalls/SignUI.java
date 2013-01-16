package com.jkush321.autowalls;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class SignUI {
	public static void onClick(Player p, String line1, String line2, String line3, String line4)
	{
		if (ChatColor.stripColor(line1.trim()).equalsIgnoreCase("[Join]"))
		{
			if (ChatColor.stripColor(line2.trim()).equals(""))
			{
				p.chat("/join");
			}
			else
			{
				p.chat("/join " + ChatColor.stripColor(line2.trim()).toLowerCase());
			}
		}
		else if (ChatColor.stripColor(line1.trim()).equalsIgnoreCase("[Kit]"))
		{
			if (ChatColor.stripColor(line2.trim()).equals(""))
			{
				p.sendMessage("This is an invalid sign.");
			}
			else
			{
				p.chat("/kit " + ChatColor.stripColor(line2.trim()).toLowerCase());
			}
		}
	}
}
