import java.util.*;

public class Main {

    static class IntWrapper{
        int v;

        public IntWrapper(int v){
            this.v = v;
        }
    }

    public static void swap(IntWrapper a, IntWrapper b){
        if(a.v > b.v){
            a.v += 25;
            b.v *= 2;
        } else{
            b.v += 25;
            a.v *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        swap(a, b);

        System.out.println(a.v + " " + b.v);
    }
}