public class SplitArrayLargestSum {

    static boolean canSplit(int[] nums, int maxSum, int k) {

        int count = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num > maxSum) {
                count++;
                currentSum = 0;
            }

            currentSum += num;
        }

        return count <= k;
    }

    public static int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (canSplit(nums, mid, k))
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    public static void main(String[] args) {

        int[] nums = {7,2,5,10,8};
        int k = 2;

        System.out.println(splitArray(nums, k));
    }
}