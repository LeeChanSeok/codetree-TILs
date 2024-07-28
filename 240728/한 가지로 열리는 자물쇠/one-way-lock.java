import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int MAX_R = 100;
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; ++i) {
			arr[i] = sc.nextInt();
		}

		int ans = N * N * N;
        for(int i = 1; i <= N; i++) {
        	if(Math.abs(arr[0] - i) <= 2) continue;
        	for(int j = 1; j <= N; j++) {
        		if(Math.abs(arr[1] - j) <= 2) continue;
        		for(int k = 1; k <= N; k++) {
        			if(Math.abs(arr[2] - k) > 2) --ans;
        		}
        		
        	}
        }
		System.out.println(ans);
	}
}