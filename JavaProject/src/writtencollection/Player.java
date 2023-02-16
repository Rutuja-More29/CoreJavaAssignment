package writtencollection;

public class Player {
	int playerid;
	String name,country,team;
	Player(int playerid,String name,String country,String team)
	{
		this.playerid=playerid;
		this.name=name;
		this.country=country;
		this.team=team;
	}
	public String toString()
	{
		return playerid+" "+name+" "+country+" "+team;
	}

}
