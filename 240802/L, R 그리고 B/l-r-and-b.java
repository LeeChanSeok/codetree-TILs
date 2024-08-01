import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	static char[][] board;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 10;
		board = new char[n][n];
		for (int i = 0; i < n; ++i) {
			board[i] = sc.next().toCharArray();
		}

		int[] X = new int[3];
		int[] Y = new int[3];
		int lx = 0, ly = 0, rx = 0, ry = 0, bx = 0, by = 0;
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < n; ++j) {
				if(board[i][j] == 'R') {
					rx = i; ry = j;
				}
				
				if(board[i][j] == 'B') {
					bx = i; by = j;
				}
				
				if(board[i][j] == 'L') {
					lx = i; ly = j;
				}
			}
		}
		int ans = Math.abs(bx - lx) + Math.abs(by - ly) - 1;
		if((lx == rx && rx == bx) && (ly < ry && ry < by)) ans += 2;
		if((lx < rx && rx < bx) && (ly == ry && ry == by)) ans += 2;
		
		
		System.out.print(ans);
	}
}