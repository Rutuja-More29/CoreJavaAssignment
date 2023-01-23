package treemap;

public class Student {
	int marks;
	String name, email;

	Student() {
	}

	Student(String name, String email, int marks) {
		this.name = name;
		this.email = email;
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
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

	public String toString() {
		return name + " " + email + " " + marks;
	}
}
