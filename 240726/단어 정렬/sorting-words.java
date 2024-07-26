import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] arr = new String[N];
        for(int i = 0; i < N; i++)
            arr[i] = sc.next();


        Arrays.sort(arr);
        for(int i = 0; i < N; i++)
            System.out.println(arr[i]);

    }
}