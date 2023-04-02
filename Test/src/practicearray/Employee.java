package practicearray;

public class Employee {
	int id;
	String name;
	double salary;
	MyDate date;
	Dept dept;
	
	Employee(int id,String name,double salary,MyDate date,Dept dept){
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.date=date;
		this.dept=dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public String toString() {
		return id+" "+name+" "+salary+" "+date+" "+dept;
	}
	public static void main(String[] args) {
		Employee[] employee= {
				new Employee(1,"john",5000,new MyDate(11,3,2023),new Dept(1,"sales")),
				new Employee(2,"Mary",6000,new MyDate(10,3,2023),new Dept(2,"comp")),
				new Employee(3,"alice",5000,new MyDate(11,3,2023),new Dept(3,"dev")),
				new Employee(13,"charm",4000,new MyDate(12,3,2023),new Dept(1,"sales")),
				new Employee(31,"john",5000,new MyDate(11,3,2023),new Dept(1,"sales")),
		};
		// employee with same joining date
		for(int i=0;i<employee.length-1;i++) {
			for(int j=i+1;j<employee.length;j++) {
				if(employee[i].getDate().equals(employee[j].getDate())) {
					System.out.println( " joining date:"+employee[i].getDate()+" "+employee[j].getDate());
				}
			}
		}
		//employee dept same
		for(int i=0;i<employee.length-1;i++) {
			for(int j=i+1;j<employee.length;j++) {
				if(employee[i].getDept().dname.equals(employee[j].getDept().dname)) {
					System.out.println( " same dept:"+employee[i].getDept().dname+" "+employee[j].getDept().dname);
				}
			}
		}
	}
}
