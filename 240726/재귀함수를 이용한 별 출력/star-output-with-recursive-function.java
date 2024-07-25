import java.util.Scanner;

public class Main {

    public static void printNstar(int n){
        if(n == 0) return;

        printNstar(n - 1);
        for(int i = 0; i < n; ++i){
            System.out.print("*");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        printNstar(N);
    }
}