package inheritanceassignment;
//hierarchical
class Person1{
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
	public String toString()
	{
		return name+" "+address;
	}
}
class Doctor extends Person1{
	int id;
	String dname,hospitalAddress;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getHospitalAddress() {
		return hospitalAddress;
	}
	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}
	public String toString()
	{
		return id+" "+dname+" "+hospitalAddress;
	}
}
class Engineer extends Person1{
	int eid,salary;
	String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String toString()
	{
		return eid+" "+ename+" "+salary;
	}
}
public class PersonDoctorEngineerMain {

	public static void main(String[] args) {
			Engineer e=new Engineer();
			e.setEid(111);
			e.setEname("abcd");
			e.setSalary(55000);
			e.setAddress("mumbai");
			e.setName("aaa");
			System.out.println(e);
			Doctor d=new Doctor();
			d.setDname("dr");
			d.setHospitalAddress("pune");
			d.setId(444);
			
			System.out.println(d);
	}

}
