import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int X = sc.nextInt();
    	int Y = sc.nextInt();
        
        int ans = 0;
        for(int i = X; i <= Y; ++i) {
        	
        	String str = String.valueOf(i);
						
        	if(isPalindrome(str)) ++ans;
        }
        
        System.out.println(ans);
    }

	private static boolean isPalindrome(String str) {

		int l = 0;
		int r = str.length()-1;
		while(l < r) {
			if(str.charAt(l++) != str.charAt(r--)) return false;
		}
		return true;
	}
}