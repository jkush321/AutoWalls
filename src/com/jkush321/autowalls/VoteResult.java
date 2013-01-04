package com.jkush321.autowalls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class VoteResult implements Runnable {
	public void run()
	{
		try {
			AutoWalls.voting = false;
			Bukkit.broadcastMessage("§4The votes are in...");
			Bukkit.broadcastMessage("§31 - " + AutoWalls.votedFor1.size());
			Bukkit.broadcastMessage("§32 - " + AutoWalls.votedFor2.size());
			Thread.sleep(2000);
			if (AutoWalls.votedFor1.size()!=AutoWalls.votedFor2.size())
			{
				if (AutoWalls.votedFor1.size() > AutoWalls.votedFor2.size())
				{
					AutoWalls.config.set("next-map", 1);
				}
				else
				{
					AutoWalls.config.set("next-map", 2);
				}
			}
			else
			{
				Random r = new Random();
				AutoWalls.config.set("next-map", r.nextInt(2) + 1);
			}
			emptyFolder(new File("custom"));
			(new File("custom")).delete();
			Bukkit.getPluginManager().getPlugin("AutoWalls").saveConfig();
			copyFolder(new File("custom" + AutoWalls.config.getInt("next-map")), new File("custom"));
			
			for (Player p : Bukkit.getOnlinePlayers())
			{
				p.kickPlayer("§cNext game: The Walls " + (AutoWalls.config.getInt("next-map")) + " §bReconnect and type /join to get in a game.");
			}
			Bukkit.shutdown();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void copyFolder(File src, File dest) throws IOException
	{
	 
	    	if(src.isDirectory()){
	 
	    		if(!dest.exists()){
	    		   dest.mkdir();
	    		}
	    		String files[] = src.list();
	 
	    		for (String file : files) {
	    		   File srcFile = new File(src, file);
	    		   File destFile = new File(dest, file);
	    		   copyFolder(srcFile,destFile);
	    		}
	 
	    	}
	    	else
	    	{
	    		//if file, then copy it
	    		//Use bytes stream to support all file types
	    		InputStream in = new FileInputStream(src);
	    	        OutputStream out = new FileOutputStream(dest); 
	 
	    	        byte[] buffer = new byte[1024];
	 
	    	        int length;
	    	        //copy the file content in bytes 
	    	        while ((length = in.read(buffer)) > 0){
	    	    	   out.write(buffer, 0, length);
	    	        }
	 
	    	        in.close();
	    	        out.close();
	    	}
	    }
		public static void emptyFolder(File dest)
	    	throws IOException{
		 
		    	if(dest.isDirectory()){
		 
		    		//if directory exists, delete the files it contains
		    		if(dest.exists()){
		 
		    		//list all the directory contents
		    		String files[] = dest.list();
		 
		    		for (String file : files) {
		    		   //construct the dest file structure
		    		   File destFile = new File(dest, file);
		    		   //recursive delete
		    		   emptyFolder(destFile);
		    			}
				}
		 
		    	}else{
		    		//if file, then delete it
				dest.delete();
		    	        }
	 
	    }
}
