import java.util.*;

public class Main {

	static int[] dx = new int[] { 1, 0, -1, 0 };
	static int[] dy = new int[] { 0, -1, 0, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int x = 0, y = 0;

		for (int i = 0; i < N; ++i) {
			char c = sc.next().charAt(0);
			int v = sc.nextInt();

			int dir = 0;
			if (c == 'S')
				dir = 1;
			else if (c == 'W')
				dir = 2;
			else if (c == 'N')
				dir = 3;
			else if (c == 'E')
				dir = 0;

			x += dx[dir] * v;
			y += dy[dir] * v;
			
		}
		System.out.println(x + " " + y);

	}

}