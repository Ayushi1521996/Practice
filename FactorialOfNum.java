package practiceJava;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int fac =1;
		
		while(n>0) {
			fac = fac*n;
			n--;
		}
		System.out.println(fac);

	}

}
