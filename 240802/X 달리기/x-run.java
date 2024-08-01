import java.util.Scanner;

public class Main {
	
	int MAX_T = 10000;
	int MAX_V = 140;
	
	static int X, ans;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		X = sc.nextInt();
		ans = Integer.MAX_VALUE;
		
		recursive(1, 1, 1);
		System.out.println(ans);
	}

	private static void recursive(int t, int v, int p) {

		if(v == 0) return;
		if(t >= ans) return;
		
		if(p == X) {
			if(v == 1) ans = t;
			return;
		}
		
		if(p > X) return;
		
		recursive(t + 1, v + 1, p + (v + 1));
		recursive(t + 1, v, p + v);
		recursive(t + 1, v - 1, p + (v - 1));
		
	}

}