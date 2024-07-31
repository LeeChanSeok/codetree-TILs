import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int N, L;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		L = sc.nextInt();
		arr = new int[N];

		for (int i = 0; i < N; ++i) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		int MAX = 100;
		int ans = 0;
		for (int i = 0; i <= MAX; ++i) {
			int aCnt = 0;
			int bCnt = 0;
			
			for(int j = 0; j < N; ++j) {
				if(arr[j] == i - 1) ++aCnt;
				else if(arr[j] >= i) ++bCnt;
			}

			int cnt = Math.min(aCnt, L);
			if(cnt + bCnt >= i) ans = i;
		}

		System.out.println(ans);
	}

}