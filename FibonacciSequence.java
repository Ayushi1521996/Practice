package practiceJava;

public class FibonacciSequence {

	public static void main(String[] args) {
	int a=0;
	int b=1; 
	int c=1;
	int n = 10; 
	for(int i=0; i<n; i++) {
		System.out.print(a + ", ");

        a = b;
		b = c;
		c = a + b;
	}
System.out.println(a);
	}

}
