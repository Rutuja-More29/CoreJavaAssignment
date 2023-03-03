package multithreading;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj=new Bank();
		
		PersonA p=new PersonA(obj);
		PersonB p1=new PersonB(obj);
		PersonC p2=new PersonC(obj);
		
		p.setName("PersonA");
		p1.setName("PersonB");
		p2.setName("PersonC");
		
		p.start();
		p1.start();
		p2.start();

	}

}
