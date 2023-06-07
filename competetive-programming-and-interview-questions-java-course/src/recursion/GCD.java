package recursion;

public class GCD {
    public static int euclidean(int a, int b) {
        if (b == 0) return a;
        return euclidean(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(euclidean(21, 11));
    }
}
