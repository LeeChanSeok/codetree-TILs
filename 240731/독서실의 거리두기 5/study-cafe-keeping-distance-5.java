import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char[] arr = sc.next().toCharArray();

		int ans = 0;
		for (int i = 0; i < N; ++i) {
			if(arr[i] == '1') continue;
			
			int l = i - 1, r = i + 1;
			
			while(l >= 0 && arr[l] != '1') --l;
			while(r < N && arr[r] != '1') ++r;

			int dist = Integer.MAX_VALUE;
			if(l != -1) 
				dist = Math.min(dist, i - l);
			if(r != N) 
				dist = Math.min(dist, r - i);
			
			ans = Math.max(ans, dist);
		}

		System.out.println(ans);
	}

}