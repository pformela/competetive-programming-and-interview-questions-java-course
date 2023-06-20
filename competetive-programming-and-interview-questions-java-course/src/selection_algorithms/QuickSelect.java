package selection_algorithms;

import java.util.Arrays;
import java.util.Random;

public class QuickSelect {

    private int[] nums;

    public QuickSelect(int[] nums) {
        this.nums = nums;
    }

    public int select(int k) {
        return quickSelect(0, nums.length - 1, k-1);
    }

    private void swap(int pivot, int lastIndex) {
        int temp = nums[pivot];
        nums[pivot] = nums[lastIndex];
        nums[lastIndex] = temp;
    }

    private int partition(int firstIndex, int lastIndex) {
        int pivot = new Random().nextInt(lastIndex - firstIndex + 1) + firstIndex;

        swap(pivot, lastIndex);
        System.out.println(Arrays.toString(nums));

        for (int index = firstIndex; index < lastIndex; index++) {
            if (nums[index] > nums[lastIndex]) {
                swap(index, firstIndex);
                firstIndex++;
                System.out.println(Arrays.toString(nums));
            }
        }

        swap(lastIndex, firstIndex);
        System.out.println(Arrays.toString(nums));

        return firstIndex;
    }

    private int quickSelect(int firstIndex, int lastIndex, int k) {
        int pivotIndex = partition(firstIndex, lastIndex);

        if (pivotIndex < k)
            return quickSelect(pivotIndex + 1, lastIndex, k);
        else if (pivotIndex > k)
            return quickSelect(firstIndex, pivotIndex - 1, k);

        return nums[k];
    }

    public static void main(String[] args) {

    }
}
