package practiceonarray;

public class Date {
	String day, month, year;

	public void setDay(String day) {
		this.day = day;
	}
	public String getDay()
	{
		return day;
	}
	public void setMonth(String month)
	{
		this.month =month;
	}
	public String getMonth()
	{
		return month;
	}
	public void setYear(String year)
	{
		this.year=year;
	}
	public String getYear()
	{
		return year;
	}
	public String toString()
	{
		return day+" "+month+" "+year;
	}
}
