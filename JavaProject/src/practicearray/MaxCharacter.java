package practicearray;

public class MaxCharacter {
	void maxChar(char arr[])
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
		System.out.println("MaxChar:"+arr[arr.length-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[]= {'A','D','E','x','R','p'};
		MaxCharacter m=new MaxCharacter();
		m.maxChar(arr);

	}

}
