package bit_manipulation;

public class IntegerBitLength {
    public static int countBits(int n) {
        int counter = 0;

        while (n > 0) {
            counter++;
            n = n >> 1;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countBits(90823456));
    }
}
