package inheritanceassignment;
  class GrandFather{
int age;
String name,education;
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
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public String toString()
{
	return name+" "+education+" "+age;
}
	
}
  class Father extends GrandFather{
	  String fname,feducation;
	  int fage,fdob;
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void seteFeducation(String feducation) {
		this.feducation = feducation;
	}
	public void setFage(int fage) {
		this.fage = fage;
	}
	public void setFdob(int fdob) {
		this.fdob = fdob;
	}
	  void display()
	  {
		  System.out.println("father details:" +fname+" "+feducation+" "+fdob+" "+fage);
	  }
  }
  class Son extends Father{
	  
	  String sname,seducation;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSeducation() {
		return seducation;
	}

	public void setSeducation(String seducation) {
		this.seducation = seducation;
	}
	  void display1()
	  {
		  System.out.println("Son details:"+sname+" "+seducation);
	  }
  }
public class GrandFatherFatherSon {
	

	public static void main(String[] args) {
		Son s=new Son();
		s.setName("Ram");
		s.setAge(85);
		s.setEducation("ssc");
		s.setFname("sham");
		s.seteFeducation("hsc");
		s.setFage(50);
		s.setFdob(1974);
		s.setSname("adi");
		s.setSeducation("Engineer");
		System.out.println(s);
		s.display();
		s.display1();

	}

}
