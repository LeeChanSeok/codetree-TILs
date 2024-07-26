import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        
        char[] arr1 = sc.next().toCharArray();
        char[] arr2 = sc.next().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isSame = true;

        if(arr1.length != arr2.length) isSame = false;
        else{
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    isSame = false;
                    break;
                }
            }
        }

        String ans = "No";
        if(isSame) ans = "Yes";
        System.out.print(ans);
    }
}