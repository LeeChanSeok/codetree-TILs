import java.util.*;

public class Main {
    public static int n, k;
    public static int[] arr;

    public static boolean isPossible(int maxVal) {
        int []availableIndices = new int[n];
        int cnt = 0;

        for(int i = 0; i < n; i++)
            if(arr[i] <= maxVal)
                availableIndices[cnt++] = i;

        for(int i = 1; i < cnt; i++) {
            int dist = availableIndices[i] - availableIndices[i - 1];
            if(dist > k)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        
        int minVal = Integer.MAX_VALUE;;
        int maxVal = 0;
        arr = new int[n];
        for(int i = 0; i < n; ++i) {
        	arr[i] = sc.nextInt();
        	maxVal = Math.max(maxVal, arr[i]);
        	minVal = Math.min(minVal, arr[i]);
        }
        
        int ans = 0;
        for(int a = arr[0]; a <= maxVal; a++)
            if(isPossible(a)) {
            	ans = a;
            	break;
            }
        
        System.out.println(ans);
    }
}