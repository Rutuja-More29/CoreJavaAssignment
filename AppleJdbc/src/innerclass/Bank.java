package innerclass;

public class Bank {
	static String branch="pune";
	int lockerDeposite=5000;
	class Locker{  //public   private   protect    default
		int accno=678945;
		int lockerDeposite=15000;
		void display()
		{
			System.out.println(branch);
			System.out.println(Bank.this.lockerDeposite);
			System.out.println(accno);
		}
	}
}
