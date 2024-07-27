import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr= new int[N];
		
		for(int i = 0; i < N; ++i) {
			arr[i] = sc.nextInt();
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < N; ++i) {
			
			int dist = 0;
			for(int j = 1, k = i; j < N; ++j) {
				k = (k+1) % N;
				dist += arr[k] * j;
						
			}
			ans = Math.min(ans, dist);
		}
		
		System.out.println(ans);
	}

}