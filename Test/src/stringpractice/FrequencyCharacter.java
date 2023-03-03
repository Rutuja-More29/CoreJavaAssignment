package stringpractice;

import java.util.Scanner;

public class FrequencyCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		int freq[]=new int[s.length()];
		char str[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			freq[i]=1;
			for(int j=i+1;j<s.length();j++) {
				if(str[i]==str[j]) {
					freq[i]++;
					str[j]='0';
				}
			}
		}
		for(int i=0;i<freq.length-1;i++) {
			if(str[i]!=' '&&str[i]!='0') {
				System.out.println(str[i]+" "+freq[i]);
			}
		}

	}

}
