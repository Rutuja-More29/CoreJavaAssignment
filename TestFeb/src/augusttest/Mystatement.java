package augusttest;

public class Mystatement {
	
	 private  static Mystatement instance = null;
	    
	   Mystatement() {
	        
	    }
	    
	    public static Mystatement getInstance() {
	        if (instance == null) {
	            instance = new Mystatement();
	        }
	        
	        return instance;
	    }
	
}
