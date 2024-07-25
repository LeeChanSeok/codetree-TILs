import java.util.*;

public class Main {

    static int N;

    public static void recursive(int n){
        if(n == 0) {
            System.out.println();
            return;
        }

        System.out.print((N - n + 1) + " ");
        recursive(n-1);
        System.out.print((N - n + 1) + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        recursive(N);
    }
}