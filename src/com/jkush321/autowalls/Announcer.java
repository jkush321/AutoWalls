package com.jkush321.autowalls;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;

public class Announcer implements Runnable {
	
	public static int message=0;
	public static List<String> messages = new ArrayList<String>();
	
	public void run()
	{
		while (true)
		{
			try {
				
				Bukkit.broadcastMessage("§4[" + AutoWalls.announcerName + "] §3" + messages.get(message));
				message++;
				if (message==messages.size()) message=0;
				Thread.sleep(60000);
				
			}catch (Exception e) { e.printStackTrace(); }
		}
	}
}
