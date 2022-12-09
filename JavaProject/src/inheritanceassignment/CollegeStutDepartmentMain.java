package inheritanceassignment;
//single level
class CollegeStut{
	String stut_name;
	int stut_id,marks;
	public String getStut_name() {
		return stut_name;
	}
	public void setStut_name(String stut_name) {
		this.stut_name = stut_name;
	}
	public int getStut_id() {
		return stut_id;
	}
	public void setStut_id(int stut_id) {
		this.stut_id = stut_id;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
class Department4 extends CollegeStut {
	int dept_id;
	String dept_name;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
}
public class CollegeStutDepartmentMain {

	public static void main(String[] args) {
		Department4 d=new Department4();
		d.setStut_id(444);
		d.setStut_name("abcd");
		d.setMarks(90);
		d.setDept_id(912);
		d.setDept_name("comp");
		System.out.println(d.getStut_id()+" "+d.getStut_name()+" "+d.getMarks()+" "+d.getDept_id()+" "+d.getDept_name());
	}

}
