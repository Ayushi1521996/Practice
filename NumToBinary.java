package practiceJava;

import java.util.Scanner;

public class NumToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int b=0;
		
		while(n>0) {
			b = n%2;
		System.out.print(b);
		n= n/2;
		}

	}

}
