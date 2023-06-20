package bit_manipulation;

public class RussianPeasantProblem {

    public static int multiply(int a, int b) {
        int result = 0;

        while (b > 0) {
            if ((b ^ 1) == b - 1) result = result + a;

            a = a << 1;
            b = b >> 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply(35, 17));
        System.out.println(35 * 17);
    }
}
