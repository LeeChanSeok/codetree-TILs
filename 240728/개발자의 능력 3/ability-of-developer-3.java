import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 6;
		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < n-2; i++) {
        	int sum = arr[i];
        	for(int j = i + 1; j < n-1; ++j) {
        		sum += arr[j];
        		for(int k = j + 1; k < n; ++k) {
        			sum += arr[k];
        			minDiff = Math.min(minDiff, Math.abs(sum - (total - sum)));
        			
        		}
        		
        	}
        	
        }
        
        System.out.println(minDiff);
	}
	
}