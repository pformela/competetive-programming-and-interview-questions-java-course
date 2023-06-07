package search_algorithms;

public class BinarySearch {
    public static int find(int[] container, int item, int left, int right) {
        if (right < left) return -1;
        int middle = (left + right) / 2;

        if (container[middle] == item) return middle;
        else if (container[middle] < item) return find(container, item, middle + 1, right);
        else return find(container, item, left, middle - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(find(nums, 100, 0, nums.length - 1));
        System.out.println(find(nums, 10, 0, nums.length - 1));
        System.out.println(find(nums, 5, 0, nums.length - 1));
    }
}
