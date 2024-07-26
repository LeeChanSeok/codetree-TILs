import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        //                                1.  2.  3.  4.  5.  6.  7.  8.  9. 10. 11. 12.
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int t1 = 0;
        for(int i = 1; i < m1; ++i){
            t1 += num_of_days[i];
        }
        t1 += d1;

        int t2 = 0;
        for(int i = 1; i < m2; ++i){
            t2 += num_of_days[i];
        }
        t2 += d2;
        
        int elapsedDays = t2 - t1;
        if(elapsedDays < 0) elapsedDays += (7 * 100);
        elapsedDays %= 7;

        String[] day = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun" };

        System.out.print(day[elapsedDays]);
    }
}