package writtensetmap;

public class MapExample {
	String adharno, votecast;

	MapExample(String adharno, String votecast) {
		this.adharno = adharno;
		this.votecast = votecast;
	}

	public String toString()

	{
		return adharno + " " + votecast;
	}

}
