package com.array;

public class ArrayLiterals {
	void arrayLenght(int a[])
	{
		System.out.println("Array Lenght:"+a.length);
	}
	void arrayElement(int a[])
	{
		System.out.println("ArrayElement are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	void searchElement(int a[],int element)
	{
		int cnt=0;
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==element)
			{
				System.out.print("element is present at index:"+i);
			}
			else
				cnt++;
				
		}
		if(cnt==a.length)
		{
			System.out.println("Element is not present");
		}
		System.out.println();
	}
	void alternateElement(int a[])
	{
		System.out.println("Alternate Element:");
		for(int i=0;i<a.length;i+=2)   
		{
			
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60,70,80,90,100};
		ArrayLiterals ar=new ArrayLiterals();
		ar.arrayLenght(arr);
		ar.arrayElement(arr);
		ar.searchElement(arr, 60);
		ar.alternateElement(arr);
	}

}
