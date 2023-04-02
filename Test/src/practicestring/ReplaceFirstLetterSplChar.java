package practicestring;

import java.util.Scanner;

public class ReplaceFirstLetterSplChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Rutuja";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='R') {
				System.out.print('@');
			}else
			{
				System.out.print(ch[i]);
			}
		}

	}

}
