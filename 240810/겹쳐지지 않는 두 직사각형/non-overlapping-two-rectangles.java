import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int MAX = 1000;
	
	static class Point{
		int x1, y1, x2, y2, sum;

		public Point(int x1, int y1, int x2, int y2, int sum) {
			super();
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.sum = sum;
		}
		
		
	}
	
	static int n, m, size;
	static Point[] points;
	static int arr[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][m];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < m; ++j) {
				arr[i][j] = sc.nextInt();
			}
		}

		
		points = new Point[MAX];
		
		for(int i1 = 0; i1 < n; ++i1) {
			for(int j1 = 0; j1 < n; ++j1) {
				
				for(int i2 = i1; i2 < n; ++i2) {
					for(int j2 = j1; j2 < n; ++j2) {
						points[size++] = new Point(i1, j1, i2, j2, getSum(i1,j1,i2,j2));
					}
				}
				
			}
		}

		int ans = Integer.MIN_VALUE;
		for(int i = 0; i < size - 1; ++i) {
			for(int j = i + 1; j < size; ++j) {
				if(solution(i, j)) {
					ans = Math.max(ans, points[i].sum + points[j].sum);
				}
				
			}
		}
		
		
		System.out.println(ans);

	}

	private static boolean solution(int a1, int a2) {

		Point point1 = points[a1];
		Point point2 = points[a2];
		
		int p1x1 = point1.x1;
		int p1y1 = point1.y1;
		int p1x2 = point1.x2;
		int p1y2 = point1.y2;
		
		int p2x1 = point2.x1;
		int p2y1 = point2.y1;
		int p2x2 = point2.x2;
		int p2y2 = point2.y2;
		
		boolean[][] visited = new boolean[n][n];
		for(int i = p1x1; i <= p1x2; ++i) {
			for(int j = p1y1; j <= p1y2; ++j) {
				visited[i][j] = true;
			}
		}
		for(int i = p2x1; i <= p2x2; ++i) {
			for(int j = p2y1; j <= p2y2; ++j) {
				if(visited[i][j]) return false;
			}
		}
		
		return true;
	}

	private static int getSum(int i1, int j1, int i2, int j2) {

		int sum = 0;
		for(int i = i1; i <= i2; ++i) {
			for(int j = j1; j <= j2; ++j) {
				sum += arr[i][j];
			}
		}
		return sum;
	}

	static public boolean inRange(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n)
			return false;
		return true;
	}

}