import java.util.Scanner;

public class Main {
	
	static int total;
	static int[] arr;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		arr = new int[n];
		total = 0;
		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < n - 1; i++) {
        	for(int j = i + 1; j < n; ++j) {
        		for(int k = 0; k < n - 1; ++k) {
        			if(k == i || k == j) continue;
        			for(int l = k + 1; l < n; ++l) {
        				if(l == i || l == j) continue;        				
        				minDiff = Math.min(minDiff, getDiff(i,j,k,l));
        			}
        			
        		}
        		
        	}
        	
        }
        
        if(minDiff == Integer.MAX_VALUE) minDiff = -1;
        System.out.println(minDiff);
	}

	private static int getDiff(int i, int j, int k, int l) {

		int sum1 = arr[i] + arr[j];
		int sum2 = arr[k] + arr[l];
		int sum3 = total - sum1 - sum2;
		
		if(sum1 == sum2 || sum2 == sum3 || sum1 == sum3) return Integer.MAX_VALUE;
		
		int max = Math.max(sum1, Math.max(sum2, sum3));
		int min = Math.min(sum1, Math.min(sum2, sum3));
		return Math.abs(max - min);
	}
	
}