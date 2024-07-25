import java.util.Scanner;

public class Main {

    public static int sum(int N){
        int total = 0;
        for(int i = 1; i <= N; ++i)
            total += i;

        return total/10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ans = sum(N);
        System.out.println(ans);
    }
}