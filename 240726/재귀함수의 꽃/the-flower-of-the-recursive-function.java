import java.util.*;

public class Main {

    public static void recursive(int N){
        if(N == 0) return;

        System.out.print(N + " ");
        recursive(N-1);
        System.out.print(N + " ");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        recursive(N);
    }
}