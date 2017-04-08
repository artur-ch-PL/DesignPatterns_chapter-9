package com.chapter9._ach.compositepattern;

public class Main {
	public static void main(String[] args) {
		Team arsenalTeam = new Arsenal();
		Team tottenhamTeam = new Tottenham();
		
		Team team = new Team(arsenalTeam.getName(), arsenalTeam.getDescription());
		team.add(arsenalTeam.getPlayers());
		
		team.add(new Team(tottenhamTeam.getName(), tottenhamTeam.getDescription()));
		team.add(tottenhamTeam.getPlayers());
		
		MatchDisplay matchDisplay = new MatchDisplay(team);
		matchDisplay.print();
	}
}
