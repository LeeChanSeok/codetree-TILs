import java.util.*;

public class Main {
    static int N;
    static int[] preO;

    static class Node {
        int data;
        Node left = null;
        Node right = null;

        Node(int data) {
            this.data = data;
        }
    }

    static Node makeT(int start, int end) {
        if (end < start) return null;

        Node root = new Node(preO[start]);
        int lowEnd = start;

        for (int i = start + 1; i <= end; i ++) {
            if (preO[i] >= root.data) break;
            lowEnd = i;
        }

        root.left = makeT(start + 1, lowEnd);

        root.right = makeT(lowEnd + 1, end);

        return root;
    }

    static void postO(Node root) {
        if (root.left != null) postO(root.left);
        if (root.right != null) postO(root.right);

        System.out.println(root.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        preO = new int[N];
        Node root;
        
        for (int i = 0; i < N; i ++) {
            preO[i] = sc.nextInt();
        }

        root = makeT(0, N - 1);

        postO(root);
    }
}