package com.chapter9._ach.compositepattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team extends TeamComponent{
	List<TeamComponent> teamComponents = new ArrayList<TeamComponent>();
	
	String name;
	String description;
	
	public Team(){}
	
	public Team(String name, String description){
		this.name = name;
		this.description = description;
	}
	
	public void add(TeamComponent teamComponent){
		teamComponents.add(teamComponent);
	}
	
	public void add(List<TeamComponent> teamComponent){
		teamComponents.addAll(teamComponent);
	}
	
	public void remove(TeamComponent teamComponent){
		teamComponent.remove(teamComponent);
	}
	
	@Override
	public void print() {
		System.out.println("====================");
		System.out.println(name);
		System.out.println("====================");
		System.out.println(description);
		Iterator<TeamComponent> iterator = teamComponents.iterator();
		while(iterator.hasNext()){
			TeamComponent teamcomponent =  iterator.next();
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
	
	public List<TeamComponent> getPlayers(){
		return teamComponents;
	}
}
