package com.dao;
	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Types;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;
	import java.util.Scanner;


	public class  VaccineBooking
	{
		
		Scanner sc = new Scanner(System.in);
		int cid,vcid;
		int pid;
		int tsid;
		String cname,vcname;
		String fullname;
		String slot;
		String firstdate;
		PreparedStatement pst;
		CallableStatement cst;
	  
	  public void holiday(Connection conn )
	  {
		  System.out.println("Enter firstDoseDate(yyyy-MM-dd)");

		 firstdate=sc.next();
		   try
		   {
			String holidaynm = null;
			 pst = conn.prepareStatement("select * from holiday where holidayDate = ?");
			 pst.setString(1, firstdate);
			 ResultSet rs = pst.executeQuery();
			 while(rs.next())
			 {
				System.out.println(rs.getInt(1)+" "+rs.getDate(2)+" "+rs.getString(3));
				holidaynm =rs.getString(1);
			 }
			
			 if(holidaynm != null)
			 {
				 System.out.println("Please choose another date");
			 }
			 else
			 {
				  this.displayCityDetail(conn);
	              this.selectCity(conn);
	            // this.vCenterDetails(conn);
	              this.selectVCenter(conn);
	              this.showtimeslot(conn);//,firstdate);
	              this.selectTimeSlot(conn);
		          this.insertPersonData(conn);
	              this.booking(conn);
		          this.display(conn);
			 }
		   }
		   catch (SQLException e) 
		   {
			e.printStackTrace();
		}
		
	  }
	    
		public void displayCityDetail(Connection conn)

		{
		
			try 
			{
				pst = conn.prepareStatement("select * from city");
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

		public void selectCity(Connection conn)
		{
			System.out.println("Enter city name");
			
	        cname = sc.next();
	     
			  try 
				{
					pst = conn.prepareStatement("select cid from city where cname = ?");
					pst.setString(1, cname);
					ResultSet rs = pst.executeQuery();
					rs.next();
				    cid = rs.getInt(1);
					System.out.println(cid);
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			  		  
			     this.vCenterDetails(conn);
		
		 }
		
		public void vCenterDetails(Connection conn)
		{
			  try
			   {
				  System.out.println("Vaccine center ");
				  pst = conn.prepareStatement("select * from vcenter where cid=?");
				  pst.setInt(1, cid);
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
			  this.selectVCenter(conn);
		  }
	    public void selectVCenter(Connection conn)
			{  
			  System.out.println("Enter Vaccine Center id");
			   vcid = sc.nextInt();
			
				try 
				{
					pst = conn.prepareStatement("select vcenter_name from vcenter where vcid = ? ");
					pst.setInt(1, vcid);
					ResultSet  rs = pst.executeQuery() ;
					rs.next();
					vcname = rs.getString(1);
					System.out.println(vcname);
				   
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
				
		     }
	  
	    public void showtimeslot(Connection conn)
	    {
	    	try
	    	{
				pst = conn.prepareStatement("select tsid,slot from timeslot where tsid not in (select tsid from vaccinationbooking where cid =? and vcid =? and first_dose_date=?) ");
			    pst.setInt(1, cid);
			    pst.setInt(2, vcid);
			    pst.setString(3, firstdate);
			    
			    ResultSet rs = pst.executeQuery();
			    while(rs.next())
			    {
			    	System.out.println(rs.getInt(1)+" "+rs.getString(2));
			    }
	    	
	    	}
	    	catch (SQLException e)
	    	{
				e.printStackTrace();
			}
	    }
	        
			public String selectTimeSlot(Connection conn)
			{ 
			
				System.out.println("Choose any one time slot from above slots ");
				tsid = sc.nextInt();
			
				try 
				{
					pst = conn.prepareStatement("select slot from timeslot where tsid = ?");
					pst.setInt(1, tsid);
					ResultSet rs = pst.executeQuery();
				  while ( rs.next()) {
					slot = rs.getString(1);
					System.out.println(slot);
				}
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				return slot;
			}
		
			
			public String insertPersonData(Connection conn)
			{
		
				System.out.println("Enter your person full name ,dob(yyyy-MM-dd) ,aadharno ,contact");
		
				sc.nextLine();
				String fullname = sc.nextLine();
				String dob = sc.next();
				String aadharno = sc.next();
				String contact = sc.next();
				try
				{
					pst= conn.prepareStatement("insert into person(full_name,dob,aadharno,contact) values(?,?,?,?)");
		
					pst.setString(1, fullname);
					pst.setString(2, dob);
					pst.setString(3, aadharno);
					pst.setString(4, contact);
					int i = pst.executeUpdate();
					
					if(i != 0)
					{
						System.out.println("Record inserted...");
					}
				} 
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				
				try 
				{
					pst = conn.prepareStatement("select pid,full_name from person where aadharno = ? ");
					pst.setString(1, aadharno);
					ResultSet rs = pst.executeQuery();
				    rs.next();
					pid = rs.getInt(1);
					fullname = rs.getString(2);
				}
				catch (SQLException e) 
				{
					e.printStackTrace();
				}

				return fullname;
			}
		
			public void booking(Connection conn)
			{
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Calendar c = Calendar.getInstance();
				String bookingdate = sdf.format(c.getTime());
				System.out.println("Enter firstdate:");
				String firstdate=sc.next();
				
				String seconddosedate = "";
				try {
					
					cst =conn.prepareCall("{? = call secondDoseDate(?)}");
					cst.registerOutParameter(1, Types.DATE);
					cst.setString(2, firstdate);
				    cst.execute();
				
				    seconddosedate= cst.getString(1);
				    System.out.println("seconddosedate:" +seconddosedate);
				}
				catch (SQLException e1)
				{
				
					e1.printStackTrace();
				}
				
				System.out.println("Thank you for booking vaccination slot  your booking details as follow ");
				
				System.out.println("City:" +cname);
				System.out.println("Center:"+vcname);
				System.out.println("BookingDate:"+bookingdate+" Slot:"+slot);
				System.out.println("first dose date:"+firstdate);
				System.out.println("Second dose date:(on or after)"+seconddosedate);
				
				
				try
				{
					pst= conn.prepareStatement("insert into vaccinationbooking(pid,cid,vcid,tsid,bookingDate,first_dose_date,second_dose_date) values(?,?,?,?,?,?,?)");
					pst.setInt(1, pid);
					pst.setInt(2, cid);
					pst.setInt(3, vcid);
					pst.setInt(4, tsid);
					pst.setString(5, bookingdate);
					pst.setString(6, firstdate);
					pst.setString(7, seconddosedate);
					
					int i = pst.executeUpdate();
					if(i != 0)
					{
						System.out.println("Reacord inserted successfully......");
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
				pst = conn.prepareStatement("select * from vaccinationbooking");
				ResultSet rs = pst.executeQuery();
				System.out.println("vbid   pid   cid  vcid  tsid  bookingDate   firstDosedate   secondDosedate " );
				while(rs.next())
				{
					System.out.println(" "+rs.getInt(1)+"     "+rs.getInt(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4)+"\t "+rs.getInt(5)+"\t"+rs.getDate(6)+"\t"+rs.getDate(7)+"\t"+rs.getDate(8)+" ");
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
	    	int vbid = sc.nextInt();
	    	
	    	try
	    	{
				pst = conn.prepareStatement("select * from vaccinationbooking where vbid = ?");
				pst.setInt(1, vbid);
				ResultSet rs = pst.executeQuery();
				while(rs.next())
				{
					System.out.println(" "+rs.getInt(1)+"     "+rs.getInt(2)+"   "+rs.getInt(3)+"   "+rs.getInt(4)+"\t "+rs.getInt(5)+"\t"+rs.getDate(6)+"\t"+rs.getDate(7)+" ");
				}
			} catch (SQLException e) 
	    	{
				e.printStackTrace();
			}
	    }
		 public void deleteData(Connection conn)
		    {
		    	System.out.println("Enter id of Vaccine booking which you want to delete");
		    	int vbid = sc.nextInt();
		    
		    	try
		    	{
					pst= conn.prepareStatement("delete from vaccinationbooking where vbid = ?");
					pst.setInt(1, vbid);
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
	}

