import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX = 100;
        boolean[] A = new boolean[MAX + 1];

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();        
        int d = sc.nextInt();

        for(int i = a; i < b; ++i){
            A[i] = true;
        }

        for(int i = c; i < d; ++i){
            A[i] = true;
        }

        int cnt = 0;
        for(int i = 0; i <= MAX; ++i) {
            if(A[i]) ++cnt;
        }

        System.out.println(cnt);

    }
}