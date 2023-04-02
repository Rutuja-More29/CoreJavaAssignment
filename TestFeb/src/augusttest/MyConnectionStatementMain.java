package augusttest;
/*write a code such that only one MyConnection and One MyStatementObj is create at all times no external class can create
 * multiple obj of MyConnection And MyStatement
 */
public class MyConnectionStatementMain {
	 public static void main(String[] args) {
	        MyConnection connection1 = MyConnection.getInstance();
	        MyConnection connection2 = MyConnection.getInstance();
	        
	        Mystatement statement1 = connection1.getStatement();
	        Mystatement statement2 = connection2.getStatement();
	        
	        System.out.println("connection1 == connection2 : " + (connection1 == connection2));
	        System.out.println("statement1 == statement2 : " + (statement1 == statement2));
	    }
}
