package com.chapter9._ach.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class MatchInfo {
	
	public static void printTeamsPlayers(ArrayList<IClub> c){
		Iterator<IClub> club = c.iterator();
		
		while(club.hasNext()){
			IClub footballClub = club.next();
			System.out.println(footballClub);
			
			Iterator<Player> players = footballClub.createIterator();
			while(players.hasNext()){
				Player player =  players.next();
				System.out.println(player);
			}
		}
	}
	
	
}
