package augusttest;
/*
 * create class project(projetid,projectname,student sarr[]),each project has max 3 student.wap to create and accept
 *  data in array of project and display the projectwise student details
*/
class Students {
	private int rollNumber;
	private String name;

	public Students(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Project {
	private int projectId;
	private String projectName;
	private Students[] students;

	public Project(int projectId, String projectName) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.students = new Students[3];
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Students[] getStudents() {
		return students;
	}

	public void setStudents(Students[] students) {
		this.students = students;
	}
}

public class StudentProjectMain {
	public static void main(String[] args) {
		Project[] projects = new Project[3];

		// Create and accept data for projects
		Project project1 = new Project(1, "Project 1");
		project1.setStudents(new Students[] { new Students(1, "John"), new Students(2, "Jane"), new Students(3, "Bob") });
		projects[0] = project1;

		Project project2 = new Project(2, "Project 2");
		project2.setStudents(new Students[] { new Students(4, "Alice"), new Students(5, "Tom") });
		projects[1] = project2;

		Project project3 = new Project(3, "Project 3");
		project3.setStudents(new Students[] { new Students(6, "Mary"), new Students(7, "Peter"), new Students(8, "Sara") });
		projects[2] = project3;

		// Display project-wise student details
		for (Project project : projects) {
			System.out.println("Project ID: " + project.getProjectId());
			System.out.println("Project Name: " + project.getProjectName());

			Students[] students = project.getStudents();
			for (Students student : students) {
				System.out.println("Roll Number: " + student.getRollNumber());
				System.out.println("Name: " + student.getName());
			}

			System.out.println();
		}
	}
}
