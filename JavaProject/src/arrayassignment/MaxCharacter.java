package arrayassignment;

public class MaxCharacter {

	public static void main(String[] args) {
		char arr[]= {'A','D','E','x','y','z'};
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
		System.out.println(arr[3]);

	}

}
