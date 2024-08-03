import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; ++i) {
        	A[i] = sc.nextInt();
        }

		int len = A.length;

		for (int i = 1; i < N; ++i) {

			int key = A[i];
			int j = i - 1;

			for (; j >= 0 && A[j] > key; --j) {
				A[j + 1] = A[j];
			}
			A[j + 1] = key;

		}
		
		for (int i = 0; i < N; ++i) {
			System.out.print(A[i] + " ");
		}
	}

}