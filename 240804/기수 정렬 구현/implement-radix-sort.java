import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];

        for(int i = 0; i < N; ++i) {
        	A[i] = sc.nextInt();
        }

        int MAX = 6;
		int len = A.length;

		for(int pos = 0; pos < MAX; ++pos) {
			
			List<Integer>[] list = new LinkedList[10];
			for(int i = 0; i < 10; ++i) {
				list[i] = new LinkedList<>();
			}
			
			for(int i = 0; i < N; ++i) {
				int num = A[i];
				for(int j = 0; j < pos; ++j) num /= 10;
				int digit = num % 10;
				list[digit].add(A[i]);
			}
			
			int j = 0;
			for(int i = 0; i < 10; ++i) {
				for(int num : list[i]) {
					A[j++] = num;
				}
			}
			
		}
		
		for (int k = 0; k < N; ++k) {
			System.out.print(A[k] + " ");
		}
	}

}