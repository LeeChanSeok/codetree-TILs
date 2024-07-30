import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
    	
        
        int ans = 0;
        for(int i = X; i <= Y; ++i) {
        	
			int sum = 0;
			int j = i;
			while(j != 0) {
				sum += j%10;
				j /= 10;
			}
        	
        	ans = Math.max(ans, sum);
        }
        
        System.out.println(ans);
    }
}