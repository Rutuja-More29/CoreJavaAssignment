package com.dao;

import java.util.Arrays;
import java.util.Scanner;

import com.pojo.Student;

public class StudentOperation {
	Student s[] = new Student[5];
	Scanner sc = new Scanner(System.in);

	public void studentData() {
		System.out.println("Enter no.of student:");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter student id,name,marks,dept,email,contact:");
			int id = sc.nextInt();
			String name = sc.next();
			int marks = sc.nextInt();
			String dept = sc.next();
			String email = sc.next();
			long contact = sc.nextLong();

			Student stud = new Student();
			stud.setId(id);
			stud.setName(name);
			stud.setMarks(marks);
			stud.setDept(dept);
			stud.setEmail(email);
			stud.setConatct(contact);

			s[i] = stud;

		}
	}

	public void insertStudentData() {
		System.out.println("Enter Student id,name,marks,dept,email,contact:");
		int id = sc.nextInt();
		String name = sc.next();
		int marks = sc.nextInt();
		String dept = sc.next();
		String email = sc.next();
		long contact = sc.nextLong();

		Student stud = new Student();
		stud.setId(id);
		stud.setName(name);
		stud.setMarks(marks);
		stud.setDept(dept);
		stud.setEmail(email);
		stud.setConatct(contact);

		for (int i = 0; i < s.length; i++) {
			if (s[i] == null) {
				s[i] = stud;
				break;
			}
		}
	}

	public void displayStudentData() {
		System.out.println(Arrays.toString(s));
	}

	public void updateStudentData() {
		System.out.println("Enter Student id,email:");
		int id = sc.nextInt();
		String email = sc.next();
		for (Student stud : s) {
			if (stud != null) {
				if (stud.getId() == id) {
					stud.setEmail(email);
				}
			}
		}
	}

	public void deleteData() {
		Student stud[] = new Student[s.length];
		System.out.println("Enter id of student to delete:");
		int id = sc.nextInt();
		int index = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].getId() == id) {
				index = i;
			}
		}
		int j = 0;
		for (int i = 0; i < s.length; i++) {
			if (i == index) {
				continue;
			} else {
				stud[j] = s[i];
				j++;
			}
		}
		for (int i = 0; i < s.length; i++) {
			s[i] = stud[i];
		}
	}

	public void searchStudentData() {
		System.out.println("search particular student data enter id: ");
		int id = sc.nextInt();
		for (Student stud : s) {
			if (stud != null) {
				if (id == stud.getId()) {
					System.out.println(stud.getId() + " " + stud.getName() + " " + stud.getMarks(0) + " "
							+ stud.getDept() + " " + stud.getEmail() + " " + stud.getConatct());
				}
			}
		}

	}
}
