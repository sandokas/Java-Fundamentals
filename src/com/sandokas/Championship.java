package com.sandokas;

import java.util.ArrayList;

public class Championship {
	ArrayList<Team> teams;
	ArrayList<Game> games;
	public Game addGame(String team1, String team2) {
		Game newGame;
		for (Game game : games) {

		}
		
		return new Game(new Team(team1), new Team(team2));
	}
	public Game getGame(String team1, String team2) {
		//TODO: implement
		return new Game(new Team(team1), new Team(team2));
	}
	public Team addTeam(String teamName) {
		Team newTeam;
		for (Team team : teams) {
			if (team.getName().equals(teamName))
				return team;
		}
		newTeam = new Team(teamName);
		teams.add(newTeam);
		return newTeam;
	}
}
