package com.chapter9._ach.compositepattern;

public class MatchDisplay {
	TeamComponent teamComponent;
	
	public MatchDisplay(TeamComponent teamComponent){
		this.teamComponent = teamComponent;
	}
	
	public void print(){
		teamComponent.print();
	}
}
