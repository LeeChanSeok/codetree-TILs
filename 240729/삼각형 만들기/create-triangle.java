import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int[][] p;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		p = new int[n][2];

		for (int i = 0; i < n; ++i) {
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
		}

		Arrays.sort(p, (p1, p2) -> {
			if(p1[0] == p2[0]) return p1[1] - p2[1];
			return p1[0] - p2[0];
		});
		
		int ans = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					
					if(isTriangle(i, j, k)) {
						ans = Math.max(ans, Math.abs((p[i][0]*p[j][1] + p[j][0]*p[k][1] + p[k][0]*p[i][1])
								-(p[j][0]*p[i][1] + p[k][0]*p[j][1] + p[i][0]*p[k][1])));
					}
					
				}

			}

		}

		System.out.println(ans);
	}

	private static boolean isTriangle(int i, int j, int k) {

		if(p[i][0] == p[j][0] && p[j][0] != p[k][0] && (p[i][1] == p[k][1] || p[j][1] == p[k][1])) return true;
		if(p[i][0] != p[j][0] && 
				((p[i][1] == p[j][1] && p[j][0] == p[k][0]) 
						||(p[i][1] != p[j][1] && p[k][1] == p[i][1] && p[k][0] == p[j][0]))) return true;
		
		return false;
	}

}