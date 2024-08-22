import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static class Data implements Comparable<Data> {
		int s, e;

		public Data(int s, int e) {
			super();
			this.s = s;
			this.e = e;
		}

		@Override
		public int compareTo(Data o) {
			// TODO Auto-generated method stub
			return this.e - o.e;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Data[] arr = new Data[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = new Data(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);

		int ans = 0;
		Data prev = new Data(0, 0);
		for (Data data : arr) {
			if (data.s >= prev.e) {
				++ans;
				prev = data;
			}
		}
		System.out.println(ans);

	}

}