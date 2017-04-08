package com.chapter9._ach.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team extends ATeamComponent{
	List<ATeamComponent> teamComponents = new ArrayList<ATeamComponent>();
	
	String name;
	String description;
	
	public Team(){}
	
	public Team(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public void add(ATeamComponent teamComponent){
		teamComponents.add(teamComponent);
	}
	
	public void add(List<ATeamComponent> teamComponent){
		teamComponents.addAll(teamComponent);
	}
	
	public void remove(ATeamComponent teamComponent){
		teamComponent.remove(teamComponent);
	}
	
	@Override
	public void print() {
		System.out.println("====================");
		System.out.println(name);
		System.out.println("====================");
		System.out.println(description);
		Iterator<ATeamComponent> iterator = teamComponents.iterator();
		while(iterator.hasNext()){
			ATeamComponent teamcomponent =  iterator.next();
			teamcomponent.print();
		}
	}

	@Override
	String getDescription() {
		return description;
	}

	@Override
	String getName() {
		return name;
	}
	
	public List<ATeamComponent> getPlayers(){
		return teamComponents;
	}
}
