import java.util.Scanner;

public class Main {

	static int[][] check;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		check = new int[N][2];
		
		for(int i = 0; i < N; ++i) {
			check[i][0] = sc.nextInt();
			check[i][1] = sc.nextInt();
		}
		
		int ans = Integer.MAX_VALUE;
		for(int i = 1; i < N - 1; ++i) {
			int dist = 0;
			for(int j = 0; j < N - 1; ++j) {
				if(j + 1 == i) {
					dist += calc_dist(j, j + 2);
					++j;
				} else {
					dist += calc_dist(j , j + 1);
				}
			}
			ans = Math.min(ans, dist);
			
		}
		
		System.out.println(ans);
	}

	private static int calc_dist(int i, int j) {
		return Math.abs(check[i][0] - check[j][0]) + Math.abs(check[i][1] - check[j][1]);
	}
}