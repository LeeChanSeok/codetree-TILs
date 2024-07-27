import java.util.*;

public class Main {

	static int OFFSET = 1000000;
	static int MAX_R = 2000000;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] a = new int[MAX_R + 1];

		int at = 0;
		int apos = 0;
		for (int i = 1; i <= N; ++i) {
			int x = sc.nextInt();
			char c = sc.next().charAt(0);

			if (c == 'L') {
				while (x-- > 0) {
					a[++at] = --apos;
				}
			} else {
				while (x-- > 0) {
					a[++at] = ++apos;
				}
			}

		}

		int[] b = new int[MAX_R + 1];

		int bt = 0;
		int bpos = 0;
		for (int i = 1; i <= M; ++i) {
			int x = sc.nextInt();
			char c = sc.next().charAt(0);

			if (c == 'L') {
				while (x-- > 0) {
					b[++bt] = --bpos;
				}
			} else {
				while (x-- > 0) {
					b[++bt] = ++bpos;
				}
			}

		}

		boolean meet = false;
		int ans = 0;
		int t = 1;
		for (; t <= Math.min(at, bt); ++t) {
			if (a[t] == b[t]) {
				if(meet) continue;
				meet = true;
				++ans;
			} else meet = false;
		}

		if (at > bt) {
			for (; t <= at; ++t) {
				if (a[t] == b[bt]) {
					if(meet) continue;
					meet = true;
					++ans;
				} else meet = false;
			}
		} else if (at < bt) {
			for (; t <= bt; ++t) {
				if (a[at] == b[t]) {
					if(meet) continue;
					meet = true;					
					++ans;
				} else meet = false;
			}
		}

		System.out.print(ans);

	}

}