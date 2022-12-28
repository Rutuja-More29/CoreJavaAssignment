package com.exception;

public class ThrowExample {
	int getStringLength(String s) throws NullPointerException
	{
		if(s==null)
		{
			throw new NullPointerException("String is null....Null String not allow");
		}
		return s.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExample t=new ThrowExample();
		try {
			System.out.println(t.getStringLength(null));
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}

	}

}
