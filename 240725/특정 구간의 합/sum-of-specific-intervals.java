import java.util.*;

public class Main {
   
    static int[] A;
    
    public static int f(int a, int b){
        int sum = 0;
        for(int i = a; i <= b; ++i){
            sum += A[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        A = new int[n + 1];
        for(int i = 1; i <= n; ++i){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < m; ++i){
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            
            System.out.println(f(a1, a2));
        }

    }
}