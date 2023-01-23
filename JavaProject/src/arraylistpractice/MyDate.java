package arraylistpractice;

public class MyDate {
	int dd,mm,yy;
	public void setDd(int dd)
	{
		this.dd=dd;
	}
	public int getDd()
	{
		return dd;
	}
	public void setMm(int mm)
	{
		this.mm=mm;
	}
	public int getMm()
	{
		return mm;
	}
	public void setYy(int yy)
	{
		this.yy=yy;
	}
	public int getYy() {
		return yy;
	}
	public String toString()
	{
		return dd+" "+mm+" "+yy;
	}
}
