import java.util.Scanner;

public class Main {

	static int len;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		len = str.length();

		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < len; ++i) {
			str = str.substring(1) + str.charAt(0);
			ans = Math.min(ans, Encoding(str));
		}

		System.out.println(ans);
	}

	private static int Encoding(String str) {

		int total = 0;
		int i = 0;
		while (i < len) {
			int j = i;
			int cnt = 0;
			while (j < len && str.charAt(i) == str.charAt(j)) {
				++j;
				++cnt;
			}
			total += 2;
			if (cnt == 10)
				++total;
			i = j;
		}
		return total;
	}

}