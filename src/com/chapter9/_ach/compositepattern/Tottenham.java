package com.chapter9._ach.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Tottenham extends Team {
	List<ATeamComponent>	players	= new ArrayList<ATeamComponent>();
	Player				gk		= new Player("Lloris", "GK", 1);
	Player				cbleft	= new Player("Rose", "CB", 3);
	Player				cbright	= new Player("Walker", "CB", 5);

	public List<ATeamComponent> getPlayers() {
		players.add(gk);
		players.add(cbleft);
		players.add(cbright);
		return players;
	}

	public String getName() {
		return "Tottenham Hotspur F.C.";
	}

	public String getDescription() {
		String description = "Tottenham Hotspur Football Club, "
				+ "\r\n"
				+ "commonly referred to as Spurs, is an English football club located in Tottenham, London, "
				+ "\r\n"
				+ "that plays in the Premier League. The club's home stadium is White Hart Lane. "
				+ "\r\n"
				+ "Its newly developed training ground is in Bulls Cross on the northern borders of the London Borough of Enfield.";
		return description;
	}

	@Override
	public void print() {}
}