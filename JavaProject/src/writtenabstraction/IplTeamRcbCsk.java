package writtenabstraction;
class IplTeam{
	void play()
	{
		System.out.println("IPL team playing");
	}
}
class Rcb extends IplTeam{
	void play()
	{
		System.out.println("Rcb team playing");
	}
}
class Csk extends IplTeam{
	void play()
	{
		System.out.println("Csk team Playing");
	}
}
public class IplTeamRcbCsk {

	public static void main(String[] args) {
		Csk c=new Csk();
		c.play();
		
		Rcb r=new Rcb();
		r.play();

	}

}
