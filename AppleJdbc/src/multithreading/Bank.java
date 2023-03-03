package multithreading;

public class Bank {
	int balance=5000;
	synchronized void deposite(int amt) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance=balance+amt;
		System.out.println("balance after depositing by:"+Thread.currentThread().getName()+ "is:"+balance);
	}
}
class PersonA extends Thread{
	Bank obj;
	PersonA(Bank obj){
		this.obj=obj;
	}
	public void run() {
		obj.deposite(20000);
	}
}

class PersonB extends Thread{
	Bank obj;
	PersonB(Bank obj){
		this.obj=obj;
	}
	public void run() {
		obj.deposite(10000);
	}
}

class PersonC extends Thread{
	Bank obj;
	PersonC(Bank obj){
		this.obj=obj;
	}
	public void run() {
		obj.deposite(20000);
	}
}

