import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        Integer[] arr1 = new Integer[N];
        for(int i = 0; i < N; i++)
            arr1[i] = sc.nextInt();
        Arrays.sort(arr1);

        Integer[] arr2 = new Integer[N];
        for(int i = 0; i < N; i++)
            arr2[i] = sc.nextInt();
        Arrays.sort(arr2);

        boolean isSame = true;
        for(int i = 0; i < N; i++){
            if(arr1[i] != arr2[i]){
                isSame = false;
                break;
            }
        }
        String ans = "No";
        if(isSame) ans = "Yes";
        System.out.print(ans);
    }
}