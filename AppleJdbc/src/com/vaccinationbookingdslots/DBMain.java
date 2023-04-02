package com.vaccinationbookingdslots;

import java.sql.Connection;
import java.util.Scanner;

public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=DBConnection.getConnection();
		DBOperations d1=new DBOperations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Vaccination Slots 1"
				+ "booking site");
		System.out.println("Enter vaccination dose do you want:(1- firstDose /2-secondDose");
		int dose=sc.nextInt();
		if(dose==1) {
			System.out.println("Enter the date:(yyyy-mm-dd):");
			String date=sc.next();
			System.out.println("Select one city:");
			d1.displayCities(conn);
			
			System.out.println("Select vaccination center");
			d1.VaccinationCenterData(conn);
			d1.slots(conn);
		
			d1.usersData(conn);
			d1.booking(conn);
		//	d1.callBookingDetails(conn);
			System.out.println("Enter booking date:");
			//d1.bookingDate(conn);
		
			System.out.println("display booking information");
			d1.displayBookingInfo(conn);
			
		}else if(dose==2) {
			System.out.println("Enter the date:(yyyy-mm-dd):");
			String date=sc.next();
			System.out.println("Select one city:");
			d1.displayCities(conn);
			
			System.out.println("Select vaccination center");
			d1.VaccinationCenterData(conn);
			d1.slots(conn);
		
			d1.usersData(conn);
			d1.booking(conn);
			System.out.println("Enter booking date:");
			//d1.bookingDate(conn);
			//d1.secondDoseDate();
			
			System.out.println("display booking information");
			d1.displayBookingInfo(conn);
		}
		
	
	}
		
		
		
	

	

}
