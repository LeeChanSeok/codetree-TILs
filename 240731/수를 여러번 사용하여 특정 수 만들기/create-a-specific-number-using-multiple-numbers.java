import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int A = sc.nextInt();
    	int B = sc.nextInt();
    	int C = sc.nextInt();
    	
    	int ans = 0;
    	int i = 0, j = 0;
    	int score = 0;
    	while(score <= C) {
    		while(score <= C) {
    			ans = Math.max(ans, score);
    			score += B;
    		}
    		score = A * (++i);
    	}
        
        System.out.println(ans);
    }
}