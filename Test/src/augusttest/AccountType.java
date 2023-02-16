package augusttest;

 enum AccountType {
	CURRENT,SAVING,DEMAT;
	public float rate_of_interest;
	static {
		System.out.println("in static");
	
	}
	
	{
		System.out.println("in instance");
	}
	
	AccountType(float r){
		rate_of_interest=r;
		System.out.println("in constructor");
	}
	AccountType(){
		System.out.println("in constructor");
	}
}
class AccountTypeMain{
	static
	{
		System.out.println(AccountType.DEMAT.rate_of_interest);
		System.out.println(AccountType.SAVING.rate_of_interest);
	}
	public static void main(String[] args) {
		System.out.println("ABA");
	}
}
