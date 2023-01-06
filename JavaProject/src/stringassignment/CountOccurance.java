package stringassignment;

public class CountOccurance {
	int countOccurance(String str,String word)
	{
		String a[]=str.split(" ");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			
			if(word.equals(a[i]))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India is my country";
		String word="is";
		CountOccurance c=new CountOccurance();
		System.out.println(c.countOccurance(str, word));

	}

}
