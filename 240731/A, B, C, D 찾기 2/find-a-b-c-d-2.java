import java.util.*;

public class Main {
	static int MAX = 40;
	public static int n;
	public static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = 15;
		arr = new int[MAX*4 + 1];

		for (int i = 0; i < n; ++i) {
			++arr[sc.nextInt()];
		}
		solution();

	}

	private static void solution() {
		for (int A = 1; A <= MAX; ++A) {
			for (int B = A; B <= MAX; ++B) {
				for (int C = B; C <= MAX; ++C) {
					for (int D = C; D <= MAX; ++D) {
						int[] arr2 = new int[MAX*4 + 1];

						++arr2[A]; ++arr2[B]; ++arr2[C]; ++arr2[D];
						++arr2[A + B]; ++arr2[A + C]; ++arr2[A + D];
						++arr2[B + C]; ++arr2[B + D]; ++arr2[C + D];
						++arr2[A + B + C]; ++arr2[A + B + D];
						++arr2[A + C + D]; ++arr2[B + C + D];
						++arr2[A + B + C + D];

						boolean isMatch = true;
						for(int i = 1; i <= MAX*4; ++i) {
							if(arr[i] != arr2[i]) {
								isMatch = false;
								break;
							}
						}
						if(isMatch) {
							System.out.println(A + " " + B + " " + C + " " + D);
							return;
						}
					}
					
				}
			}
		}

	}
}