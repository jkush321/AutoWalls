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
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WallDropper implements Runnable {
	
	public static int time;
	public static int timeContinued;

	public void run() {
	
		while (true)
		{
			if (AutoWalls.gameInProgress)
			{
				time--;
				timeContinued--;
				
				if (time > 0) timeContinued = time;
				
				if (time==-1)
				{
					time = 0;
				}
				
				if (time==50*60)
				{
					announce("There are", 50, "minutes remaining!");
				}
				if (time==40*60)
				{
					announce("There are", 40, "minutes remaining!");
				}
				if (time==30*60)
				{
					announce("There are", 30, "minutes remaining!");
				}
				if (time==20*60)
				{
					announce("There are", 20, "minutes remaining!");
				}
				if (time==10*60)
				{
					announce("There are", 10, "minutes remaining!");
				}
				else if (time==5*60)
				{
					announce("There are", 5, "minutes remaining, all players have recieved 2 beef!");
					ItemStack beef = new ItemStack(Material.COOKED_BEEF, 2);
					for (Player p : AutoWalls.playing)
					{
						p.getInventory().addItem(beef);
					}
				}
				else if (time==3*60)
				{
					announce("There are", 3, "minutes remaining!");
				}
				else if (time==2*60)
				{
					announce("There are", 2, "minutes remaining!");
				}
				else if (time==60)
				{
					announce("There is", 1, "minute remaining!");
				}
				else if (time==30)
				{
					announce("There are", 30, "seconds remaining!");
				}
				else if (time==10)
				{
					announce("There are", 10, "seconds remaining!");
				}
				else if (time==9)
				{
					announce("There are", 9, "seconds remaining!");
				}
				else if (time==8)
				{
					announce("There are", 8, "seconds remaining!");
				}
				else if (time==7)
				{
					announce("There are", 7, "seconds remaining!");
				}
				else if (time==6)
				{
					announce("There are", 6, "seconds remaining!");
				}
				else if (time==5)
				{
					announce("There are", 5, "seconds remaining!");
				}
				else if (time==4)
				{
					announce("There are", 4, "seconds remaining!");
				}
				else if (time==3)
				{
					announce("There are", 3, "seconds remaining!");
				}
				else if (time==2)
				{
					announce("There are", 2, "seconds remaining!");
				}
				else if (time==1)
				{
					announce("There is", 1, "second remaining!");
				}
				else if (timeContinued==0)
				{
					dropWalls();
					//break;
				}
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}	
	
	public void announce(String whatToSay, int time, String end)
	{
		Bukkit.broadcastMessage("§4" + whatToSay + " §e" + time + "§4 " + end);
	}
	
	public void dropWalls()
	{
		if (AutoWalls.mapNumber==1)
		{
			new Location(AutoWalls.playing.get(0).getWorld(), 409, 108, -787).getBlock().setType(Material.BEDROCK);
			new Location(AutoWalls.playing.get(0).getWorld(), 353, 108, -855).getBlock().setType(Material.BEDROCK);
			new Location(AutoWalls.playing.get(0).getWorld(), 285, 108, -799).getBlock().setType(Material.BEDROCK);
			new Location(AutoWalls.playing.get(0).getWorld(), 341, 108, -731).getBlock().setType(Material.BEDROCK);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Location(AutoWalls.playing.get(0).getWorld(), 409, 110, -787).getBlock().setType(Material.BEDROCK);
			new Location(AutoWalls.playing.get(0).getWorld(), 353, 110, -855).getBlock().setType(Material.BEDROCK);
			new Location(AutoWalls.playing.get(0).getWorld(), 285, 110, -799).getBlock().setType(Material.BEDROCK);
			new Location(AutoWalls.playing.get(0).getWorld(), 341, 110, -731).getBlock().setType(Material.BEDROCK);
			
			Bukkit.broadcastMessage("§4DOWN WITH THE WALLS");
		}
		else
		{
			new Location(AutoWalls.playing.get(0).getWorld(), -794, 20, -173).getBlock().setType(Material.REDSTONE_TORCH_ON);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Location(AutoWalls.playing.get(0).getWorld(), -794, 20, -173).getBlock().setType(Material.AIR);
			
			Bukkit.broadcastMessage("§4DOWN WITH THE WALLS");
		}
	}

}
