package questionpapre;

public class ArrayExample {

	public static void main(String[] args) {
		
		boolean a[]= {true,false,true,true,false};
		int trueCount=0;
		for(boolean val:a) {
			if(val) {
				trueCount++;
			}
		}
		System.out.println("true count:"+trueCount);
		
	}

}
