import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
    	
    	int MAX_N = 1000;
    	Scanner sc = new Scanner(System.in);
    	
    	int T = sc.nextInt();
    	int a = sc.nextInt();
    	int b = sc.nextInt();
        
    	char[] arr = new char[MAX_N + 1];
    	for(int i = 0; i < T; ++i) {
    		char c = sc.next().charAt(0); 
    		int pos = sc.nextInt();
    		arr[pos] = c;
    	}
        
    	int ans = 0;
        for(int i = a; i <= b; ++i) {
        	
        	int d1 = Integer.MAX_VALUE;
        	int d2 = Integer.MAX_VALUE;
        	
        	for(int j = 1; j <= MAX_N; ++j) {
        		if(arr[j] == 'S') d1 = Math.min(d1, Math.abs(i - j));
        		else if(arr[j] == 'N') d2 = Math.min(d2, Math.abs(i - j));
        	}

        	if(d1 <= d2) ++ans;
        	
        }
        
        System.out.println(ans);
    }
}