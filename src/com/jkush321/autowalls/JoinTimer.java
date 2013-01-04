package com.jkush321.autowalls;

import org.bukkit.Bukkit;

public class JoinTimer implements Runnable {

	public static int timeleft;
	
	public void run() {
		while (timeleft > 0)
		{
			try
			{
				Thread.sleep(1000);
				timeleft--;
				
				if (timeleft>=10 && timeleft % 10 == 0)
				{
					Bukkit.broadcastMessage("§3You can §e/join§3 in " + timeleft + " seconds!" + " §4Make sure to use /kit !!!!");
					Bukkit.broadcastMessage("§2You can §e/join §2any time if you have " + AutoWalls.earlyJoinPriority + " or more priority!");
				}
				if (timeleft==5)
				{
					Bukkit.broadcastMessage("§3You can §e/join§3 in " + timeleft + " seconds!" + " §4Make sure to use /kit !!!!");
				}
				if (timeleft==4)
				{
					Bukkit.broadcastMessage("§3You can §e/join§3 in " + timeleft + " seconds!" + " §4Make sure to use /kit !!!!");
				}
				if (timeleft==3)
				{
					Bukkit.broadcastMessage("§3You can §e/join§3 in " + timeleft + " seconds!" + " §4Make sure to use /kit !!!!");
				}
				if (timeleft==2)
				{
					Bukkit.broadcastMessage("§3You can §e/join§3 in " + timeleft + " seconds!" + " §4Make sure to use /kit !!!!");
				}
				if (timeleft==1)
				{
					Bukkit.broadcastMessage("§3You can §e/join§3 in " + timeleft + " second!" + " §4Make sure to use /kit !!!!");
				}
				if (timeleft==0)
				{
					Bukkit.broadcastMessage("§3You can now §e/join§3!");
				}
			}
			catch (Exception e) { System.out.println("JoinTimer error."); e.printStackTrace(); }
		}
		AutoWalls.canJoin=true;
	}
	
}
