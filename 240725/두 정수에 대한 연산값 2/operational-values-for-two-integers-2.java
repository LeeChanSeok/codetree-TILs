import java.util.*;

public class Main {

    static class IntWrapper{
        int v;

        public IntWrapper(int v){
            this.v = v;
        }
    }

    public static void f(IntWrapper a, IntWrapper b){
        if(a.v > b.v){
            a.v *= 2;
            b.v += 10;
        } else{
            b.v *= 2;
            a.v += 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        f(a, b);

        System.out.println(a.v + " " + b.v);
    }
}