package inheritanceassignment;
class IPLTeam{
	void play()
	{
		System.out.println("Playing 11 players");
	}
}
class CSK extends IPLTeam{
	
	void play()
	{
		System.out.println("Playong 14 players from csk team");
	}
}
class RCB extends IPLTeam{
	void play()
	{
		System.out.println("playing 12 players from rcb team");
	}
}

public class IPLTeamCSKRCB {
	

	public static void main(String[] args) {
		CSK c=new CSK();
		c.play();
		RCB r= new RCB();
		r.play();

	}

}
