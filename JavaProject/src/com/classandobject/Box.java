package com.classandobject;

public class Box {
	int lenght,width,height;
	/*Box(int l,int w,int h)
	{
		lenght=l;
		width=w;
		height=h;
	}*/
	void volume()
	{
		int volume=lenght*width*height;
		System.out.println("Volume of Box is:"+volume);
	}

	public static void main(String[] args) {
		Box b= new Box();
		b.width=20;
		b.lenght=10;
		b.height=30;
		b.volume();

	}
	

}
