package com.array;

public class VariableArgument {
	void add(String name,int...marks)   //1 argument....complete array
	{
		int sum=0;
		System.out.println(name);
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		System.out.println("percent:"+(sum/marks.length));
	}

	public static void main(String[] args) {
		
		VariableArgument v=new VariableArgument();
		v.add("anay", 60,70,80);
	}

}
