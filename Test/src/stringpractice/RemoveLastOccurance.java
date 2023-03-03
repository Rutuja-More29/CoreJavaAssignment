package stringpractice;

public class RemoveLastOccurance {

	public static void main(String[] args) {
		String str="hello world";
		String result=null;
		if((str!=null)&&(str.length()>0)){
			result=str.substring(0, str.length()-1);
		}
		System.out.println(result);

	}

}
