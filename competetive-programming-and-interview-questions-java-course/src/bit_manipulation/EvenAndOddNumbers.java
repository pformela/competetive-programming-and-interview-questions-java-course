package bit_manipulation;

public class EvenAndOddNumbers {

    public static boolean isEven(int n) {
        return (n ^ 1) == n + 1;
    }

    public static void main(String[] args) {
        System.out.println(isEven(12));
        System.out.println(isEven(133));
    }
}
