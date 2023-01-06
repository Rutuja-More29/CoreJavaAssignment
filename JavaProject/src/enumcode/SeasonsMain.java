package enumcode;

public class SeasonsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seasons s[]=Seasons.values();
		for(Seasons ss:s)
		{
			System.out.println(ss);
			ss.discription();
		}

	}

}
