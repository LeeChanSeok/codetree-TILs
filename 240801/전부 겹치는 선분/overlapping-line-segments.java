import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX = 100;
        int[] A = new int[MAX + 1];

        int N = sc.nextInt();

        for(int i = 0; i < N; ++i){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j <= b; ++j){
                ++A[j];
            }
        }  

        boolean isAllContain = false;
        for(int i = 0; i <= MAX; ++i){
            if(A[i] == N) isAllContain = true;
        }  

        if(isAllContain) 
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}