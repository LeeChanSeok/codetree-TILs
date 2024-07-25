import java.util.*;

public class Main {

	
    static int N;    
    static int[] arr;

    public static int F(int k) {
        if(k == N + 1) {
            return arr[N];
        }
        arr[k] = arr[k/3] + arr[k - 1];        
        return F(k+1);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N + 1];
        arr[1] = 1;   
        arr[2] = 2;

        int ans = 0;
        if(N == 1) ans = 1;
        else if(N == 2) ans = 2;        
        else ans = F(3);

        System.out.println(ans);
    }
}