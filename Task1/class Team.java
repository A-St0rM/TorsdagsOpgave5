import java.util.*;

class Team{
	private String teamName;
	private int rank;
	private ArrayList<String> playerName = new ArrayList<String>();

	Team(String teamName){

	this.teamName = teamName;

	}

	public int setRank(int rank){

	return this.rank = rank;

	}

	public String toString(){

		return "Team: " + teamName + " Rank: " + rank + '\n' + "Team player " + playerName;
	}

	public void addPlayer(String name){

		playerName.add(name);

	}

}