package augusttest;

 class MyConnection {
    private static MyConnection instance = null;
  private   Mystatement statement;
    
   private  MyConnection() {
        statement = new Mystatement();
    }
    
    public static MyConnection getInstance() {
        if (instance == null) {
            instance = new MyConnection();
        }
        
        return instance;
    }
    
    public Mystatement getStatement() {
        return statement;
    }
}

 
   



