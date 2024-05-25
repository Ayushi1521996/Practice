package practiceJava;

import java.util.Scanner;

public class TableOfNum {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	for(int i=1; i<=10; i++) {
		int fac= n *i;
		System.out.println(n +"*" +i +"=" +fac);
	}

	}

}
