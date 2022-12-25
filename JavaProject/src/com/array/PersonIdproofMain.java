package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class PersonIdproofMain {

	public static void main(String[] args) {
		Person p[] = new Person[2];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < p.length; i++) {

			System.out.println("Enter person id,pname,address:");
			int id = sc.nextInt();
			String pname = sc.next();
			String address = sc.next();
			
			IdProof idp[] = new IdProof[2];
			System.out.println("Enter IdProof information:");
			for (int j = 0; j < p.length; j++) {
				System.out.println("Enter name,validity:");
				String name = sc.next();
				int validity = sc.nextInt();
				
				IdProof idp1=new IdProof();
				idp1.setName(name);
				
				idp[j]=idp1;
			}
			Person p1 = new Person();
			p1.setId(id);
			p1.setPname(pname);
			p1.setAddress(address);
			p1.setIdp(idp);
			
			p[i] = p1;

		}
		for (Person p1 : p) {
			for (IdProof idp1 : p1.getIdp()) {
				if (idp1.getName().equalsIgnoreCase("pancard")) {
					System.out.println(p1.getPname() + p1.getAddress() + " " + idp1.getName());
				}
			}
		}
	}

}
