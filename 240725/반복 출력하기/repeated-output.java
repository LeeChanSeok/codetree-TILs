import java.util.Scanner;

public class Main {
    public static void printNline(int n){
        for(int i = 0; i < n; ++i){
            System.out.println("12345^&*()_");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printNline(N);
    }
}