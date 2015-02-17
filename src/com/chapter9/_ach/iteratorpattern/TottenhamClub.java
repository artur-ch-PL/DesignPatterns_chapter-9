package com.chapter9._ach.iteratorpattern;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TottenhamClub implements IClub{
	Set<Player> players = new HashSet<Player>();
	Player[] team = new Player[11];

	public TottenhamClub(){
		players.add(new Player("Adebayor"));
		players.add(new Player("Lukaku"));
		
		team[0] = new Player("Adebayor");
		team[1] = new Player("Lukaku");
	}
	
	@Override
	public Iterator<Player> createIterator() {
		return new TottenhamClubIterator(team);
	}


	public String toString(){
		return "TOTTENHAM FOOTBALL CLUB";
	}

	
}
