import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++)
            arr[i] = sc.nextInt();


        Arrays.sort(arr);
        for(int i = 0; i < N; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < N; i++) // 81, 60, 41, 37, 25, 20, 19, 12
            System.out.print(arr[i] + " ");
    }
}