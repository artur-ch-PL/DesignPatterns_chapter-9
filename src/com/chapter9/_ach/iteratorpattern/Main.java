package com.chapter9._ach.iteratorpattern;

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArsenalClub arsenalClub = new ArsenalClub();
		TottenhamClub tottenhamClub = new TottenhamClub();
		
		ArrayList<IClub> clubs = new ArrayList<IClub>();
		clubs.add(arsenalClub);
		clubs.add(tottenhamClub);
		
		MatchInfo.printTeamsPlayers(clubs);
		
	}
	
	
}
