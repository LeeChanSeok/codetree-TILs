import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int a = 0, b = 0;
        for(int i = 0; i < N * 2; i++){
            if(i % 2 == 0) a += sc.nextInt();
            else b += sc.nextInt();
        }            
        System.out.print(Math.max(a, b));
    }
}