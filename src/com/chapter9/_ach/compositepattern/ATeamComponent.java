package com.chapter9._ach.compositepattern;

public abstract class ATeamComponent {
	public void add(ATeamComponent teamComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(ATeamComponent teamComponent) {
		throw new UnsupportedOperationException();
	}

	abstract String getDescription();
	abstract String getName();
	abstract public void print();

}
