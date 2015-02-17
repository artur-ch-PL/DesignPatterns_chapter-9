package com.chapter9._ach.compositepattern;

public abstract class TeamComponent {
	public void add(TeamComponent teamComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(TeamComponent teamComponent) {
		throw new UnsupportedOperationException();
	}

	abstract String getDescription();
	abstract String getName();
	abstract public void print();

}
