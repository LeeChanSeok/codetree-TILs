import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int MAX_R = 100;
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();		
		int K = sc.nextInt();
		
		int[] arr = new int[MAX_R + 1];
		for (int i = 0; i < N; ++i) {
			int c = sc.nextInt();
			int p = sc.nextInt();
			
			arr[p] += c;
		}
		
		int ans = 0;
		
		for(int i = 0; i <= MAX_R; ++i) {
			

			int l = Math.max(0, i - K);
			int r = Math.min(MAX_R, i + K);
			
			int sum = 0;
			for(int j = l; j <= r; ++j) {
				sum += arr[j];
			}
			
			ans = Math.max(ans, sum);
		}
        
        System.out.println(ans);
	}
}