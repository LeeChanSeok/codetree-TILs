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
        
        boolean sorted;
        
        do {
        	sorted = true;
        	for(int i = 0; i < N - 1; ++i) {
        		if(A[i] > A[i+1]) {
        			int tmp = A[i];
        			A[i] = A[i+1];
        			A[i+1] = tmp;
        			sorted = false;
        			
        		}
        		
        	}
        } while(!sorted);
        
        for(int i = 0; i < N; ++i) {
        	System.out.print(A[i] + " ");
        }
    }
    
}