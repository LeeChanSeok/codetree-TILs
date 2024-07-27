import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();		
		int[] arr = new int[n];

		for (int i = 0; i < n; ++i) {
			arr[i] = sc.nextInt();
		}

        int ans = 0;
        for(int i = 0; i < n; i++) {
        	for(int j = i; j < n; j++) {
        		int sumVal = 0;
        		for(int k = i; k <= j; k++)
        			sumVal += arr[k];
        		
        		if(sumVal % (j - i + 1) == 0) {
        			int num = sumVal / (j - i + 1);
        			boolean isContain = false;
        			for(int k = i; k <= j; k++) {
        				if(arr[k] == num) {
        					isContain = true;
        				}
        			}
        			
        			if(isContain) ++ans;
        		}
        	}
        	
        }
        
        System.out.println(ans);
	}
}