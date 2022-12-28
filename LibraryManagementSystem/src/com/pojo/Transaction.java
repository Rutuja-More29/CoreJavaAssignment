package com.pojo;

public class Transaction {
	String bookName, issueDate, returnDate;
	Student s;
	
	public Transaction()
	{
		
	}

	public Transaction(Student s,String bookName,String issueDate,String returnDate)
	{
		this.s=s;
		this.bookName=bookName;
		this.issueDate=issueDate;
		this.returnDate=returnDate;
	}
	
	
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}
	public String toString()
	{
		return bookName+" "+issueDate+" "+returnDate+" "+s;
	}
}
