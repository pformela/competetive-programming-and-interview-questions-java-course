package selection_algorithms;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, -5, 10, 55, 2, 3};

        QuickSelect qs = new QuickSelect(nums);

        System.out.println(qs.select(2));
    }
}
