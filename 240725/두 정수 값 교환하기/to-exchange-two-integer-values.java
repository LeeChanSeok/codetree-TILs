import java.util.*;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void modify(IntWrapper n, IntWrapper m) {
        int tmp = n.value;
        n.value = m.value;
        m.value = tmp;        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        IntWrapper n = new IntWrapper(x);
        IntWrapper m = new IntWrapper(y);
        modify(n, m);
        System.out.println(n.value + " " + m.value);
    }
}