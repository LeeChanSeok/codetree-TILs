import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int MAX_N = 3;

    public static int n = MAX_N;
    public static int[] a = new int[MAX_N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        Arrays.sort(a);

        int d1 = a[1] - a[0];
        int d2 = a[2] - a[1];
        
        int min = Math.min(d1, d2);
        int max = Math.max(d1, d2);
        
        int ans = 0;
        if(min == 1 && max == 1) {
        	ans = 0;
        } else {
        	ans = max - 1;
        } 
        
        System.out.println(ans);
    }
}