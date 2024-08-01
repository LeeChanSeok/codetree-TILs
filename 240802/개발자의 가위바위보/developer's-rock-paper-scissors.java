import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] X = new int[N];
		int[] Y = new int[N];
		
		for(int i = 0; i < N; ++i) {
			X[i] = sc.nextInt();
			Y[i] = sc.nextInt();
		}
	
		int max = 0;
		
		for(int i = 1; i <= 3; ++i) {
			for(int j = 1; j <= 3; ++j) {
				if(i == j) continue;
				for(int k = 1; k <= 3; ++k) {
					if(i == k || j ==k) continue;
					
					int win = 0;
					for(int l = 0; l < N; ++l) {
						if((X[l] == 1 && Y[l] ==3) || 
								(X[l] == 2 && Y[l] ==1) ||
								(X[l] == 3 && Y[l] == 2)) ++win;
					}
					
					max = Math.max(max, win);
				}
			}
		}
		
		System.out.println(max);
	}


}