import java.util.*;

class Data {
    String n;
    String a;
    String p;

    public Data(){
        this.n = null;
        this.a = null;
        this.p = null;
    }

    public Data(String n, String a, String p){
        this.n = n;
        this.a = a;
        this.p = p;
    }
    
};

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Data ans = new Data(sc.next(), sc. next(), sc.next());
        for(int i = 1; i < N; ++i){
            Data data = new Data(sc.next(), sc. next(), sc.next());

           if(ans.n.compareTo(data.n) < 0) ans = data;

        }

        System.out.println("name " + ans.n);
        System.out.println("addr " + ans.a);
        System.out.println("city " + ans.p);
        
    }
}