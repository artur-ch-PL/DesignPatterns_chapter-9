package com.chapter9._ach.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Arsenal extends Team {
	List<ATeamComponent>	players	= new ArrayList<ATeamComponent>();
	Player				gk		= new Player("Szczesny", "GK", 1);
	Player				cbleft	= new Player("Mertesacker", "CB", 4);
	Player				cbright	= new Player("Koscielny", "CB", 5);

	public List<ATeamComponent> getPlayers() {
		players.add(gk);
		players.add(cbleft);
		players.add(cbright);
		return players;
	}

	public String getName() {
		return "Arsenal Football Club";
	}

	public String getDescription() {
		String description = "Arsenal Football Club is a professional football club based in Holloway, "
				+ "\r\n"
				+ "London that plays in English football's top tier, the Premier League. "
				+ "\r\n"
				+ "One of the most successful clubs in English football, "
				+ "\r\n"
				+ "they have won 13 First Division and Premier League titles and a joint record 11 FA Cups.";
		return description;
	}

	@Override
	public void print() {}

}
