import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] a = new int[N+1];
        a[0] = -1;

        int cnt = 0;
        for(int i = 1; i <= N; i++)
            if(a[i] != a[i - 1])
                cnt++;

        System.out.print(cnt);

    }
}