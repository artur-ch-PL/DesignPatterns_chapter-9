package com.chapter9._ach.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class MatchInfo {
	
	public static void printTeamsPlayers(ArrayList<IClub> club){
		Iterator<IClub> clubIterator = club.iterator();
		
		while(clubIterator.hasNext()){
			IClub footballClub = clubIterator.next();
			System.out.println(footballClub);
			
			Iterator<Player> playersIterator = footballClub.createIterator();
			while(playersIterator.hasNext()){
				Player player =  playersIterator.next();
				System.out.println(player);
			}
		}
	}
	
	
}
