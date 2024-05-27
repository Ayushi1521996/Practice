package practiceJava;

public class MergeSortedArray_BruteForceApproach {

	public static void main(String[] args) {
		int A[] = {4,9,13,17};
		int B[] = {1,5,7};
		int n= A.length;
		int m = B.length;
		int lastInd = n+m-1;
		int i = n-1;
		int j = m-1;
		
		int C[] = new int[n+m];
		while(j>=0) {
			if(i>=0 && A[i]> B[j]) {
				C[lastInd] = A[i];
				i--;
			}
			else {
				C[lastInd] = B[j];
				j--;
			}
			lastInd--;
		}
        for (int k = 0; k < n+m; k++)
            System.out.print(C[k] +" ");
		

	}

}
