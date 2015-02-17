package com.chapter9._ach.compositepattern;

public class Player extends TeamComponent {
	String name;
	String position;
	Integer number;
	
	public Player(String name, String position, Integer number){
		this.name = name;
		this.position = position;
		this.number = number;
	}
	
	@Override
	public void print() {
		System.out.println("Player name:\t\t" + name + "\t" + number + "\t" + position);
	}

	@Override
	String getDescription() {
		throw new UnsupportedOperationException();
	}

	@Override
	String getName() {
		return name;
	}

	
}
