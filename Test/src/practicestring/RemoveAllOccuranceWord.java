package practicestring;

public class RemoveAllOccuranceWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="core java advance java sessions java";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(str[i].equalsIgnoreCase("java"))
				continue;
		else
		{
			System.out.println(str[i]);
		}
		}

	}

}
