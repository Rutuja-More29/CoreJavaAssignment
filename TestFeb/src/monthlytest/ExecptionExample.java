package monthlytest;
 class CustomException extends Exception{
	  CustomException(String erroeMessage) {
		 super("errorMessage");
	 }
 }
 class ABC{
	 void method() throws CustomException{
		 throw new CustomException("CustomException thrown form ABC class");
	 }
 }
 class CDF extends ABC{
	 void method()throws CustomException{
		try { super.method();
		}catch(CustomException e) {
		
		throw new CustomException("CustomException re-thrown from cdf");
		}
		finally {
			System.out.println("finally block executed in cdf class");
		}
	 }
 }
public class ExecptionExample {
	public static void main(String[] args) {
		try {
			CDF c=new CDF();
			c.method();
		}catch(CustomException e) {
			System.out.println("Caught customException"+e.getMessage());
		}
	}
}
