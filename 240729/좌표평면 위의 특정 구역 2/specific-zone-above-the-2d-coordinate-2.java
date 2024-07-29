import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] point = new int[n][2];
		
		for (int i = 0; i < n; ++i) {
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}

		int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
        	int minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        	int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE;
        	
            for(int j = 0; j < n; j++) {
            	if(i == j) continue;
            	minX = Math.min(minX, point[j][0]);
            	minY = Math.min(minY, point[j][1]);
            	maxX = Math.max(maxX, point[j][0]);
            	maxY = Math.max(maxY, point[j][1]);
            }
            
            ans = Math.min(ans, (maxX - minX) * (maxY - minY));
        }
        
        System.out.println(ans);
	}

		
}