import java.util.Scanner;

public class Main {

    static int[] arr;

    public static int F(int n) {
        if(n == -1) {
            return 0;
        }
        
        return (int)Math.max(arr[n], F(n-1));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        arr = new int[N];

        for(int i = 0; i < N; ++i){
            arr[i] = sc.nextInt();
        }

        System.out.println(F(N-1));
    }
}