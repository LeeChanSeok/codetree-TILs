import java.util.*;

public class Main {

    public static void recursive(int N){
        if(N == 0) return;

        for(int i = 0; i < N; ++i){
            System.out.print("* ");
        }
        System.out.println();
        
        recursive(N-1);

        for(int i = 0; i < N; ++i){
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        recursive(N);
    }
}