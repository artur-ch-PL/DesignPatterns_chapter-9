package com.chapter9._ach.compositepattern;

public class MatchDisplay {
	ATeamComponent teamComponent;
	
	public MatchDisplay(ATeamComponent teamComponent){
		this.teamComponent = teamComponent;
	}
	
	public void print(){
		teamComponent.print();
	}
}
