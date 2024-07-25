import java.util.*;

public class Main {

	
    static int N;    
    static int[] arr;

    public static int F(int k) {
        
        boolean isLCM = true;
        for(int i = 0; i < N; ++i) {
            if(k % arr[i] != 0) {
                isLCM = false;
                break;
            }
        }
        if(isLCM) return k;
        return F(k+1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int[N];
        
        for(int i = 0; i < N; ++i){
            arr[i] = sc.nextInt();
        }

        System.out.println(F(1));
    }
}