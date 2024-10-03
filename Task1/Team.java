import java.util.ArrayList;

public class Team{


private String teamName;

private int teamRank;

private ArrayList<String>playerName = new ArrayList<String>();

public Team(String teamName){
this.teamName = teamName;

}

public void setRank(int newTeamRank){
	this.teamRank = newTeamRank;
}

public String toString(){
	return " Hold: " + this.teamName + " Rang: " + this.teamRank + " Spiller navn: " + playerName;

}

public void addPlayer(String player){

playerName.add(player);

}

}