package practiceJava;

import java.util.Scanner;

public class RevereTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String str = "";
		char ch;
		
		for(int i=0; i<s.length(); i++) {
			
			ch = s.charAt(i);
			str = ch+str;
		}
	System.out.println(str);
	}

}
