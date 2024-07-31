import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char[] arr = sc.next().toCharArray();

		int ans = 0;
		for (int i = 0; i < N - 1; ++i) {
			if(arr[i] == '1') continue;
			for (int j = i + 1; j < N; ++j) {
				if(arr[j] == '1') continue;
				
				arr[i] = '1';
				arr[j] = '1';
				
				int dist = Integer.MAX_VALUE;
				int prev = -1;
				for(int k = 0; k < N; ++k) {
					if(arr[k] == '1') {
						if(prev == -1) prev = k;
						else {
							dist = Math.min(dist, k - prev);
							prev = k;
						}
					}
				}
				
				ans = Math.max(ans, dist);
				arr[i] = '0';
				arr[j] = '0';
			}
		}

		System.out.println(ans);
	}

}