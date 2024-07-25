import java.util.*;

public class Main {

    public static boolean isF(int M){
        if(M % 4 == 0){
            if(M % 100 == 0){
                if(M % 400 == 0) return true;
                return false;
            }
            return true;
        } 

        return false;
    }

    public static String getSeason(int Y, int M, int D){

        int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int d = day[M];
        if(M == 2 && isF(M)){            
            d = 29;
        }

        if(d >= D) return "-1";

        if(M >= 3 && M <= 5) return "Spring";
        else if(M >= 3 && M <= 5) return "Summer";
        else if(M >= 3 && M <= 5) return "Fall";
        else return "Winter";
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int M = sc.nextInt();
        int D = sc.nextInt();
        
        System.out.println(getSeason(Y, M, D));
    }
}