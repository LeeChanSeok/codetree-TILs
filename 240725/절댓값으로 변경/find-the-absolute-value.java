import java.util.*;

public class Main {

    public static void abs(int n , int[] arr) {
        for(int i = 0; i < n; ++i) {
            if(arr[i] < 0) arr[i] *= -1;
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }
        abs(n, arr);

        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}