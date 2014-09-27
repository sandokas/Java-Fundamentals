package com.sandokas.exercises.championship;

import java.util.HashMap;


public class Game {
	private Team team1;
	private Team team2;
	private int score1;
	private int score2;
	private boolean reported;
	Game(Team team1, Team team2)
	{
		this.team1 = team1;
		this.team2 = team2;
		score1 = -1;
		score2 = -1;
	}
	public boolean compares(Team team1, Team team2) {
		boolean ret = false;
		if (team1.getName().equals(team1) && team2.getName().equals(team2)) {
			ret = true;
		}
		return ret;
	}
	public void setScore(int scoreTeam1, int scoreTeam2) {
		score1 = scoreTeam1;
		score2 = scoreTeam2;
	}
	public boolean getReported() {
		return reported;
	}
	public boolean setReported() {
		return reported;
	}
	public int getScoreTeam1 () {
		return score1;
	}
	public int getScoreTeam2() {
		return score2;
	}
	public Team getTeam1 () {
		return team1;
	}
	public Team getTeam2() {
		return team2;
	}
}
