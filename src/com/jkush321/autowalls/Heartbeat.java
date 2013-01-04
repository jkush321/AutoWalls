package com.jkush321.autowalls;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import org.bukkit.Bukkit;

public class Heartbeat implements Runnable {
	public void run()
	{
		while (true)
		{
			try{
				
				URL url = new URL("http://infacraft.net/autowalls/hb.php?port=" + Bukkit.getPort() + "&online=" + Bukkit.getOnlinePlayers().length + "&max=" + Bukkit.getMaxPlayers() + "&teamsize=" + AutoWalls.teamSize + "&version=" + AutoWalls.version);
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
				String s = "";
				String response = "";
				while ((s=br.readLine()) != null)
				{
					response+=s;
				}
				
				if (!response.trim().equals("Done.")) System.out.println("Abnormal: Heartbeat returned " + response);
				
				Thread.sleep(60000);
				
				url = new URL("http://infacraft.net/autowalls/version.txt");
				br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
				s = "";
				response = "";
				while ((s=br.readLine()) != null)
				{
					response+=s;
				}
				
				response=response.trim();
				
				if (!response.equals(AutoWalls.version)){
					Bukkit.broadcast("§4Your AutoWalls (§cv:" + AutoWalls.version + "§4) Is Outdated! Please Update To (§cv:" +response + "§4)", "walls.op");
					url = new URL("http://infacraft.net/autowalls/majorchanges.txt");
					br = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
					s = "";
					response = "";
					while ((s=br.readLine()) != null)
					{
						response+=s;
					}
					
					response=response.trim();
					Bukkit.broadcast("§4Major Changes: §c" + response, "walls.op");
				}
				
			}catch (Exception e) { System.out.println("Heartbeat error!"); e.printStackTrace(); }
		}
	}
}
