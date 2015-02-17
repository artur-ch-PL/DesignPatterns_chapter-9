package com.chapter9._ach.iteratorpattern;

public class Player {
	String name;
	
	public String getName() {
		return name;
	}

	public Player(String name){
		this.name = name;
	}
	
	public String toString(){
		return "Player name: \t" + getName();
	}
	
}
