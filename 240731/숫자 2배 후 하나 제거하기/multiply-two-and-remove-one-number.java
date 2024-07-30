import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int[] arr = new int[N];
    	
    	for(int i = 0; i < N; ++i) {
    		arr[i] = sc.nextInt();
    	}
    	
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++) {
        	
            arr[i] *= 2;
        
            for(int j = 0; j < N; j++) {
                int[] remainingArr = new int[N - 1];
                int cnt = 0;
                for(int k = 0; k < N; k++)
                    if(k != j)
                        remainingArr[cnt++] = arr[k];
        
                int sumDiff = 0;
                for(int k = 0; k < N - 2; k++)
                    sumDiff += Math.abs(remainingArr[k + 1] - remainingArr[k]);
        
                minDiff = Math.min(minDiff, sumDiff);
            }
        
            arr[i] /= 2;
        }
        
        System.out.println(minDiff);
    }
}