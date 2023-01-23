package practicestring;

public class RemoveLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="good morning";
		String r=null;
		if(s!=null && s.length()>0)
		{
			r=s.substring(0, s.length()-1);
		}
		System.out.println(r);

	}

}
