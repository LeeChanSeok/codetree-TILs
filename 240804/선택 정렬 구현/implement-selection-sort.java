import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        
        for(int i = 0; i < N; ++i) {
        	A[i] = sc.nextInt();
        }
        
        int len = A.length;
        for(int i = 0; i < N - 1; ++i) {
        	int min = i;
        	
        	for(int j = i + 1; j < N; ++j) {
        		if(A[j] < A[min]) {
        			min = j;
        		}
        	}
        	
        	int tmp = A[i];
        	A[i] = A[min];
        	A[min] = tmp;
        }
        
        for(int i = 0; i < N; ++i) {
        	System.out.print(A[i] + " ");
        }
    }
    
}