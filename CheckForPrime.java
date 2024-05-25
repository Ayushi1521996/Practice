package practiceJava;

import java.util.Scanner;

public class CheckForPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count =0;
		if (n <= 1) {
			System.out.println("false");
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if(count>1) {
			System.out.println("False");
		}
		else
		System.out.println("True");
	}

}
