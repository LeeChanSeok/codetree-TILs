import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static int n, m, ans;
	static List<Integer>[] graph;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		graph = new List[n+1];
		for(int i = 1; i <= n; ++i) {
			graph[i] = new LinkedList<>();
		}
		
		visited = new boolean[n+1];
		for(int i = 0; i < m; ++i) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			graph[x].add(y);
			graph[y].add(x);
		}
		
		DFS(1);
		System.out.println(ans - 1);
	}

	private static void DFS(int node) {
		visited[node] = true;
		++ans;
		
		for(int next : graph[node]) {
			if(visited[next]) continue;
			DFS(next);
		}
		
	}


}