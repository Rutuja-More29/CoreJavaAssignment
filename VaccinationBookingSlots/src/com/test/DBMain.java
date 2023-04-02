package com.test;

import java.sql.Connection;
import java.util.Scanner;

import com.dao.DBConnection;
import com.dao.VaccineBooking;


public class DBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=DBConnection.getConnection();
		VaccineBooking d1=new VaccineBooking();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Vaccination Slots "
				+ "booking site");
		System.out.println("Enter vaccination dose do you want:(1- firstDose /2-secondDose");
		int dose=sc.nextInt();
		System.out.println();
		System.out.println("Enter the date:(yyyy-mm-dd):");
		String date=sc.next();
		
		if(dose==1) {
			d1.displayCityDetail(conn);
			d1.selectCity(conn);
			d1.vCenterDetails(conn);
			d1.selectVCenter(conn);
			d1.showtimeslot(conn);
			d1.selectTimeSlot(conn);
			
			d1.insertPersonData(conn);
			d1.booking(conn);
			d1.display(conn);
			d1.searchData(conn);
			d1.deleteData(conn);
		}
		else if(dose==2) {
			d1.displayCityDetail(conn);
			d1.selectCity(conn);
			d1.vCenterDetails(conn);
			d1.selectVCenter(conn);
			d1.showtimeslot(conn);
			d1.selectTimeSlot(conn);
			d1.insertPersonData(conn);
			d1.booking(conn);
			d1.display(conn);
			d1.searchData(conn);
			d1.deleteData(conn);
		}

	}

}
