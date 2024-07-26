import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        int N = sc.nextInt();
        int K = sc.nextInt();
        String T = sc.next();
        int len = T.length();
        
        List<String> list = new ArrayList<>();

        for(int i = 0; i < N; ++i){
            String str = sc.next();

            if(str.length() < len) continue;
            if(T.equals(str.substring(0, len))) list.add(str);
            
        }
        
        Collections.sort(list);
        
        System.out.print(list.get(K-1));
    }
}