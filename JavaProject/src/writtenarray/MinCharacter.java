package writtenarray;

import java.util.Arrays;

public class MinCharacter {
	void minChar(char arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
		
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(arr[0]);
	}

	public static void main(String[] args) {
		char arr[]= {'A','B','D','x','z','R'};
		 MinCharacter m=new  MinCharacter();
		 m.minChar(arr);

	}

}
