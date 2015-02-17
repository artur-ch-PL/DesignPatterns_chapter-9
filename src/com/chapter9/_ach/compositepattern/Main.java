package com.chapter9._ach.compositepattern;

public class Main {
	public static void main(String[] args) {
		Team arsenal = new Arsenal();
		Team tottenham = new Tottenham();
		
		Team team = new Team(arsenal.getName(), arsenal.getDescription());
		team.add(arsenal.getPlayers());
		
		team.add(new Team(tottenham.getName(), tottenham.getDescription()));
		team.add(tottenham.getPlayers());
		
		MatchDisplay matchDisplay = new MatchDisplay(team);
		matchDisplay.print();
	}
}
