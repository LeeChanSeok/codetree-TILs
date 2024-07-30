import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static final int MAX = 100;

	static int N;
	static int[][] point;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		point = new int[N][2];

		for (int i = 0; i < N; ++i) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
		for(int i = 2; i <= MAX - 2; i = i + 2) {
			for(int j = 2; j <= MAX - 2; j = j + 2) {
				
				int[] cnt = new int[4];
				for(int k = 0; k < N; ++k) {
					int x = point[k][0];
					int y = point[k][1];
					
					if(x > i && y > j) ++cnt[0];
					else if(x > i && y < j) ++cnt[1];
					else if(x < i && y < j) ++cnt[2];
					else if(x < i && y > j) ++cnt[3];
				}
				
				int max = 0;
				for(int k = 0; k < 4; ++k) {
					max = Math.max(max, cnt[k]);
				}
				
				ans = Math.min(ans, max);
			}
		}


		System.out.println(ans);
	}

	
}