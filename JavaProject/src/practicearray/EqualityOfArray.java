package practicearray;

public class EqualityOfArray {
	void equals(int arr1[],int arr2[])
	{
		if(arr1.length==arr2.length)
		{
			System.out.println("Arrays are equals");
		}
		else
		{
			System.out.println("Array are not equals");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {12,22,32,42,52,62};
		int arr2[]= {52,22,62,12,42,22};
		EqualityOfArray e=new EqualityOfArray();
		e.equals(arr1,arr2);

	}

}
