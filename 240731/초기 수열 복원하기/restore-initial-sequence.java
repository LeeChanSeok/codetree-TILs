import java.util.Scanner;

public class Main {

	static int N;
	static int[] arr, ans;
	static boolean[] used;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new int[N-1];
		ans = new int[N];
		used = new boolean[N+1];
		
		for(int i = 0; i < N - 1; ++i) {
			arr[i] = sc.nextInt();
		}
		for(int i = 1; i <= N; ++i) {
			if(recursive(i, 0)) break;
		}
		
	}

	private static boolean recursive(int num, int cnt) {
		ans[cnt] = num;
		used[num] = true;
		
		if(cnt == N - 1) {
			for(int i = 0; i < N; ++i)
				System.out.print(ans[i] + " ");
			return true;
		}
		
		for(int i = 1; i <= N; ++i) {
			if(ans[cnt] + i == arr[cnt] && !used[i]) {
				if(recursive(i, cnt + 1)) return true;
			}
		}
		used[num] = false;
		return false;
	}

	

}