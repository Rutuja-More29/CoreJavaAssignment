package inheritanceassignment;
class Person{
	String name,address;

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
	void display()
	{
		System.out.println("Person details:"+name+" "+address);
	}
}
class Teacher extends Person{
	int id;
	String tname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	void display1()
	{
		System.out.println("Teacher info:"+id+" "+tname);
	}
}
class Student extends Teacher{
	int sid;
	String sname,dept;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	void display2()
	{
		System.out.println("StudentInfo:"+sid+" "+sname+" "+dept);
	}
}
public class PersonTeacherStudentMain {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("aaa");
		s.setAddress("pune");
		s.setId(111);
		s.setTname("bbbb");
		s.setSid(201);
		s.setSname("pqrs");
		s.setDept("comp");
		s.display();
		s.display1();
		s.display2();
	}

}
