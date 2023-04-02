package designpattern;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
	public class VaccinationBooking
	{
		Scanner sc = new Scanner(System.in);
		PreparedStatement pst;
		CallableStatement cst;
		int lid,hid,tid;
		String aadhar_number,fullname,city_name,hname,timeslot;
		//public void booking(Connection conn)
		public void locationData(Connection conn)
		{
			try 
			{
				pst = conn.prepareStatement("select * from locations");
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		
			
			System.out.println("Enter location id");
			 lid = sc.nextInt();
			city_name =sc.next();
			  try
			   {
				  pst = conn.prepareStatement("select * from locations where lid=?");
				  pst.setInt(1, lid);
				  ResultSet rs = pst.executeQuery();
				   while(rs.next())
				   {
					  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
				   }
			   }
			  catch (SQLException e)
			   {
			    	e.printStackTrace();
			   }
		}
			 
			public void hospitalData(Connection conn)  
			{
			  try
			   {
				  pst = conn.prepareStatement("select * from hospital where lid=?");
				  pst.setInt(1, lid);
				  ResultSet rs = pst.executeQuery();
				   while(rs.next())
				   {
					  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
				   }
			   }
			  catch (SQLException e)
			   {
			    	e.printStackTrace();
			   }
			  
			  System.out.println("Enter hospital id");
				hid = sc.nextInt();
			    hname = sc.next();
				try
				   {
					  pst = conn.prepareStatement("select * from hospital where hid=?");
					  pst.setInt(1, hid);
					  ResultSet rs = pst.executeQuery();
					   while(rs.next())
					   {
						  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
					   }
				   }
				  catch (SQLException e)
				   {
				    	e.printStackTrace();
				   }
			}
				
			 public void timeslotData(Connection conn)
			 {	
				 
				 try 
				 {
					cst = conn.prepareCall("{ call timeslotdelete(?,?)}");
					cst.setString(1, city_name);
					cst.setString(2, hname);
					cst.execute();
				 }
				 catch (SQLException e1)
				 {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				 
				try
				{
					
					pst = conn.prepareStatement("select * from timeslots");
					ResultSet rs = pst.executeQuery();
					 while(rs.next())
					   {
						  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");
					   }
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				System.out.println("Choose any one time slot from above slots ");
				 tid = sc.nextInt();
				 timeslot = sc.next();
				try 
				{
					pst= conn.prepareStatement("select * from timeslots where tid =? ");
					pst.setInt(1, tid);
					
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" ");
					}
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
			}

				public void personData(Connection conn)
				{
				
				System.out.println("Enter your person aadhar number,full name ,contact ,age,address: ");
				 aadhar_number = sc.next();
				 sc.nextLine();
				 fullname = sc.nextLine();
				String contact= sc.next();
				int age = sc.nextInt();
				String address= sc.next();
				
				try
				{
					pst= conn.prepareStatement("insert into person values(?,?,?,?,?)");
					pst.setString(1, aadhar_number);
					pst.setString(2, fullname);
					pst.setString(3, contact);
					pst.setInt(4, age);
					pst.setString(5, address);
					
					
					int i = pst.executeUpdate();
					
					if( i != 0)
					{
						System.out.println("Record inserted Successfully.....");
					}
				} 
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				
			}	
				public void vaccinationData(Connection conn)
				{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Calendar c = Calendar.getInstance();
				String booking_date = sdf.format(c.getTime());
				//c.add(Calendar.DATE, 60);
				System.out.println("Enter firstDate ");
				String firstdate = sc.next();
				
				
				String seconddate = "";//sdf.format(c.getTime());
				
				try 
				{
					cst = conn.prepareCall("{? = call seconddosedate(?)}");
					cst.registerOutParameter(1, Types.DATE);
					cst.setString(2, firstdate);
					cst.execute();
					seconddate= cst.getString(1);
				    System.out.println("seconddosedate:" +seconddate);
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				
				//System.out.println(firstdate);
				//System.out.println(seconddate);
				
				
				System.out.println("Thank you for booking vaccination slot "+fullname+" your booking details as below");
				//System.out.println("City"+city);
				System.out.println("City:" +city_name);
				System.out.println("Center:"+hname);
				System.out.println("BookingDate:"+booking_date+"  Slot:"+timeslot);
				System.out.println("first dose date:"+firstdate);
				System.out.println("Second dose date:(on or after)"+seconddate);
				
				
				try
				{
					pst= conn.prepareStatement("insert into booking(aadhar_number,lid,hid,tid,booking_date,first_dose,second_dose) values(?,?,?,?,?,?,?)");
					pst.setString(1, aadhar_number);
					pst.setInt(2, lid);
					pst.setInt(3, hid);
					pst.setInt(4, tid);
					pst.setString(5, booking_date);
					pst.setString(6, firstdate);
					pst.setString(7, seconddate);
					
					int i = pst.executeUpdate();
					if(i != 0)
					{
						System.out.println("Record inserted successfully......");
					}
				}
				catch (SQLException e)
				{
					e.printStackTrace();
				}
				
			    }
		
		public void display(Connection conn)
		{
			try
			{
				pst = conn.prepareStatement("select * from booking");
				ResultSet rs = pst.executeQuery();
				System.out.println("bid   aadhar_number   lid  hid  tid  booking_date   first_dose   second_dose " );
				while(rs.next())
				{
					System.out.println(" "+rs.getInt(1)+"     "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4)+"\t "+rs.getInt(5)+"\t"+rs.getDate(6)+"\t"+rs.getDate(7)+"\t "+rs.getDate(8)+" ");
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
		}

		public void searchData(Connection conn)
	    {
	    	System.out.println("Enter id of vacination booking which you want to search");
	    	int bid = sc.nextInt();
	    	
	    	try
	    	{
				pst = conn.prepareStatement("select * from booking where bid = ?");
				pst.setInt(1, bid);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					System.out.println(" "+rs.getInt(1)+"     "+rs.getString(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4)+"\t "+rs.getInt(5)+"\t"+rs.getDate(6)+"\t"+rs.getDate(7)+"\t "+rs.getDate(8)+" ");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		 public void deleteData(Connection conn)
		    {
		    	System.out.println("Enter id of Vaccine booking which you want to delete");
		    	int bid = sc.nextInt();
		    
		    	try
		    	{
					pst= conn.prepareStatement("delete from booking where bid = ?");
					pst.setInt(1, bid);
					int i = pst.executeUpdate();
					if(i != 0)
					{
						System.out.println("Deleted Successfully...");
					}
				} 
		    	catch (SQLException e)
		    	{
					e.printStackTrace();
				}
		    }
		 
		 
		  void holiday(Connection conn )
		   {
			  System.out.println("ENter firstdate");
			  String firstddate=sc.next();
			   try
			   {
				String holidaynm = null;
				 pst = conn.prepareStatement("select * from holiday where holidayDate = ?");
				 pst.setString(1, firstddate);
				 ResultSet rs = pst.executeQuery();
				 while(rs.next())
				 {
					System.out.println(rs.getInt(1)+" "+rs.getDate(2)+" "+rs.getString(3));
					holidaynm =rs.getString(1);
				 }
				// System.out.println(holidaynm);
				 if(holidaynm != null)
				 {
					 System.out.println("Please choose another date");
				 }
			   }
			   catch (SQLException e) 
			   {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   }
	    
	}
}
