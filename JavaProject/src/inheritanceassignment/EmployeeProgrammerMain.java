package inheritanceassignment;
//single level
class Employee{
	int emp_id,salary;
	String emp_name;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	
}
class Programmer extends Employee{
	int id,salary,age;
	String name,email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
public class EmployeeProgrammerMain {

	public static void main(String[] args) {
		Programmer p1=new Programmer();
		p1.setEmp_id(111);
		p1.setEmp_name("ram");
		p1.setId(411);
		p1.setName("sham");
		p1.setSalary(45000);
		p1.setAge(30);
		p1.setEmail("sham26@gmail.com");
		System.out.println(p1.getEmp_id()+" "+p1.getEmp_name()+" "+p1.getId()+" " +p1.getName()+" "+p1.getSalary()+" "+p1.getAge()+" "+p1.getEmail());

	}

}
