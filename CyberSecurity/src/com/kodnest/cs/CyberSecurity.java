package com.kodnest.cs;

public class CyberSecurity {
	public static void main(String[] args) {
		String s = "([{}])";//Output: true
		int len = s.length();
				
		boolean valid = isValid(s, len);
		System.out.println(valid);
	}

	public static boolean isValid(String s, int len) {
		if(s.equals("")) {
			return true;
		}
		
		int count = 0;
		String str1 = "";
		String str2 = "";
		
		for(int i=0; i<s.length()/2; i++) {
			str1 = str1 + s.charAt(i);			
		}
		
		for(int j=s.length()-1; j>=(len/2); j--) {
			str2 = str2 + s.charAt(j);
		}
		
		for(int i=0; i<str1.length(); i++) {
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if(len%2 == 0) {
				if((ch1=='(' && ch2==')') ||
						(ch1=='{' && ch2=='}') ||
						(ch1=='[' && ch2==']')) {
					count++;
				}	
			}
		}
		if(len/2 == count) {
			return true;
		}
		else {
			return false;
		}
	}
}