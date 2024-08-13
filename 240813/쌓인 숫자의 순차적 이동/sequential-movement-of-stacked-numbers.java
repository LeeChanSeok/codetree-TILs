import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	static int[] dx = { -1, -1, -1, 0, 1, 1, 1, 0 };
	static int[] dy = { -1, 0, 1, 1, 1, 0, -1, -1 };

	static int n, m;
	static int[][] arr;
	static LinkedList<Integer>[][] list;

	static int[][] pos;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		arr = new int[n][n];
		list = new LinkedList[n][n];
		pos = new int[n * n + 1][2];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {

				list[i][j] = new LinkedList<>();

				int num = sc.nextInt();
				list[i][j].add(num);
				pos[num][0] = i;
				pos[num][1] = j;

				arr[i][j] = num;
			}
		}

		while (m-- > 0) {
			int num = sc.nextInt();
			move(num);
		}

		print();
	}

	private static void move(int num) {

		int x = pos[num][0];
		int y = pos[num][1];

		calcMax();
		int[] next = findNext(x, y);
		if(next == null) return;

		int nx = next[0];
		int ny = next[1];
		
		boolean move = false;
		Iterator<Integer> iter = list[x][y].iterator();
		while (iter.hasNext()) {
			int v = iter.next();
			if( v == num) move = true;
			
			if(move) {
				iter.remove();
				pos[v][0] = nx;
				pos[v][1] = ny;
				list[nx][ny].add(v);
			}
		}

	}

	private static void calcMax() {

		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				int max = 0;
				for (int num : list[i][j]) {
					max = Math.max(max, num);
				}
				arr[i][j] = max;

			}
		}

	}

	private static int[] findNext(int x, int y) {

		int max = 0;
		int[] pos = new int[2];
		for (int d = 0; d < 8; ++d) {
			int nx = x + dx[d];
			int ny = y + dy[d];

			if (!inRange(nx, ny))
				continue;

			if (arr[nx][ny] > max) {
				max = arr[nx][ny];
				pos[0] = nx;
				pos[1] = ny;
			}
		}

		if(max == 0) return null;
		return pos;
	}

	private static void print() {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				if(list[i][j].isEmpty()) System.out.print("None");
				else {
					Iterator<Integer> iter = list[i][j].descendingIterator();
					while(iter.hasNext()) {
						System.out.print(iter.next() + " ");
					}
				}
				System.out.println();
			}
		}

	}

	private static boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}