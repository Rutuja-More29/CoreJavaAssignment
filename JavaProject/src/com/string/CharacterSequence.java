package com.string;

import java.util.Arrays;

public class CharacterSequence {

	public static void main(String[] args) {
		String s = "the quick brown fox jumps over the lazy dog";
		char ch[] = s.toCharArray();
		System.out.println(Arrays.toString(ch));
		Arrays.sort(ch);
		System.out.println(ch);
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[j] < ch[i]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
					
				
				}
				j++;
			}
			i++;
			
		}
		System.out.println(ch+" ");
		
		
	}

}
