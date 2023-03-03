package innerclass;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj=new Bank();
		Bank.Locker lock=obj.new Locker();
		lock.display();
		

	}

}
