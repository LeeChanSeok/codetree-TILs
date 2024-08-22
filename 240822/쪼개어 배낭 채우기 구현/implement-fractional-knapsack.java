import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static class Data implements Comparable<Data> {
		int w, v;

		public Data(int w, int v) {
			super();
			this.w = w;
			this.v = v;
		}

		@Override
		public int compareTo(Data o) {
			return Double.compare((double) o.v / o.w, (double) v / w);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		Data[] arr = new Data[n];

		for (int i = 0; i < n; ++i) {
			arr[i] = new Data(sc.nextInt(), sc.nextInt());
		}
		Arrays.sort(arr);

		double ans = 0;
		for (Data data : arr) {
			double x = (double) data.v / data.w;

			int remain = Math.min(m, data.w);

			ans += x * remain;
			m -= remain;

		}
		System.out.printf("%.3f", ans * 1000 / 1000);

	}

}