package practicearray;

public class MinCharacter {
	void minChar(char arr[])
	{
		for(char i=0;i<arr.length;i++)
		{
			for(char j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
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
		// TODO Auto-generated method stub
		char arr[]= {'A','D','E','x','R','Z','p'};
		MinCharacter m=new MinCharacter();
		m.minChar(arr);

	}

}
