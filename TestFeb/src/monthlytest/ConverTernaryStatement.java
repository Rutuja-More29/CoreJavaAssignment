package monthlytest;

public class ConverTernaryStatement {
public ConverTernaryStatement() {
	// TODO Auto-generated constructor stub
	int score = 0;
  if(score<4000) {
		if(score<25000) {
			System.out.println("bronze");
		}else
		{
			System.out.println("Silver");
			if(score<25000)
				System.out.println("bronze");
			else
				System.out.println("silver");
		}
  }
		else if(score<6000) 
			System.out.println("gold");
		else
			System.out.println("Platinum");
		
	}
	

	
}
