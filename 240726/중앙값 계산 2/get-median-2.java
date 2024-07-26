import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; ++i){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < N; ++i){
            if(i % 2 == 0){
                Arrays.sort(arr, 0, i + 1);
                System.out.print(arr[i/2] + " ");
            }
        }

    }
}