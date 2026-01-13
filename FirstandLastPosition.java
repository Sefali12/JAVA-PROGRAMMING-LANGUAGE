import java.util.Arrays;

public class FirstandLastPosition {

    public static void main(String[] args) {
        int[] nums = {-14,-12,-5,0,3,7,9,12,15,18,22,22,22,27,30};
        int target = 22;

        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    // Returns [firstPosition, lastPosition]
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        ans[0] = search(nums, target, true);   // first occurrence
        ans[1] = search(nums, target, false);  // last occurrence

        return ans;
    }

    // Binary search to find first or last position
    static int search(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } 
            else if (target > nums[mid]) {
                start = mid + 1;
            } 
            else {
                result = mid;   // target found

                if (findFirst) {
                    end = mid - 1;   // go left
                } else {
                    start = mid + 1; // go right
                }
            }
        }
        return result;
    }
}
