package model;

import java.util.ArrayList;

public class Season {
	private String name;
	private String leagueName;
	
	public ArrayList<Game> games;
	private int numOfGames;
	private float seasonRevenue;
	
	public Season(String name, String leagueName) {
		games=new ArrayList<Game>();
		this.name=name;
		this.leagueName=leagueName;
		this.numOfGames=0;
		this.seasonRevenue=0;
	}
	//methods:
	public int getNumOfGames() {
		return numOfGames;
	}
	public void setNumOfGames(int numOfGames) {
		this.numOfGames=numOfGames;
	}
	public String getName() {
		return name;
	}
	public String getLeagueName() {
		return leagueName;
	}
	public void createGame(String name, String date, int stadiumCapacity, float vipTicketPrice, float clubLevelTicketPrice, float bleachersTicketPrice, float seasonTicketPrice, Stadium stadium) {
		games.add(new Game(name, date, stadiumCapacity, vipTicketPrice, clubLevelTicketPrice, bleachersTicketPrice, seasonTicketPrice, stadium));
		numOfGames++;
	}

	public float getGamesRevenue() {
		for (int i = 0; i < numOfGames; i++) {
			this.seasonRevenue+=games.get(i).getTotalGameRevenue();
		}
		return this.seasonRevenue;
	}
	public Game getGame(int gameNumber){
		return this.games.get(gameNumber);		
	}
}
