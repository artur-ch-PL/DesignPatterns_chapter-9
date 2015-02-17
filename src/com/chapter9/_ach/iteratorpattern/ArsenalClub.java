package com.chapter9._ach.iteratorpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class ArsenalClub implements IClub {
	ArrayList<Player> players = new ArrayList<Player>();
	
	public ArsenalClub(){
		players.add(new Player("Szczesny"));
		players.add(new Player("Gnarby"));
	}
	
	public ArrayList<Player> getPlayers(){
		return players;
	}
	
	@Override
	public Iterator<Player> createIterator() {
		return players.iterator();
	}
	
	public String toString(){
		return "ARSENAL FOOTBALL CLUB";
	}

}
