import java.util.*;

class Data {
    String y;
    String d;
    String w;

    public Data(){
        this.y = null;
        this.d = null;
        this.w = null;
    }

    public Data(String y, String d, String w){
        this.y = y;
        this.d = d;
        this.w = w;
    }
    
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Data ans = null;
        for(int i = 0; i < N; ++i){
            Data data = new Data(sc.next(), sc. next(), sc.next());

           if(data.w.equals("Rain")) {
        	   if(ans == null) ans = data;
        	   else if(ans.y.compareTo(data.y) > 0) ans = data;
        	   
           }

        }

        System.out.println(ans.y + " " + ans.d + " " + ans.w);
        
        
    }
}