package com.chapter9._ach.iteratorpattern;

import java.util.Iterator;

public class TottenhamClubIterator implements Iterator<Player> {
	Player[] players;
	int position = 0;
	
	public TottenhamClubIterator(Player[] p) {
		this.players = p;
	}
	
	@Override
	public Player next() {
		Player player = players[position];
		position++;
		return player;
	}

	@Override
	public boolean hasNext() {
		if(position >= players.length || players[position] != null ){
			return true;
		} else{
			return false;
		}
	}


	@Override
	public void remove() {}

}
