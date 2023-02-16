package questionpapre;
/* class person is as follows.person{string name,int salary,String address} create a person object by using getter setter
 * method create clone of person
 */
 class Person1 implements Cloneable {
	String name;
	String address;
	int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return name+" "+salary+" "+address;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
}
 class Main{


	public static void main(String []args) throws CloneNotSupportedException {
		Person1 p=new Person1();
		p.setName("rita");
		p.setSalary(70000);
		p.setAddress("pune");
		
		Person1 c=(Person1)p.clone();
		System.out.println(c.getName()+" "+c.getSalary()+" "+c.getAddress());
		
			
		
	}
}
