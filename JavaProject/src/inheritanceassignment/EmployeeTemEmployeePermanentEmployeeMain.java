package inheritanceassignment;
//Hierarchical
class Employee2{
	int baseSalary;
	Employee2()
	{
		this.baseSalary=50000;
	}
}
class TempEmployee extends Employee2{
	float incrementPercent;
	TempEmployee()
	{
		this.incrementPercent=0.1f;
	}
}
class PermanentEmployee extends Employee2{
	float incrementPercent;
	PermanentEmployee()
	{
		this.incrementPercent=0.2f;
	}
}

public class EmployeeTemEmployeePermanentEmployeeMain {

	public static void main(String[] args) {
		TempEmployee te=new TempEmployee();
		System.out.println("Total salary of temporary Employee:"+((te.baseSalary*te.incrementPercent)+te.baseSalary));
		PermanentEmployee pe=new PermanentEmployee();
		System.out.println("Total salary of Permanent Employee:"+((pe.baseSalary*pe.incrementPercent)+pe.baseSalary));
	}

}
