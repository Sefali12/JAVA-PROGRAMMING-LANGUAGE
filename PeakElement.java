import java.util.Arrays;

public class PeakElement {

    public static void main(String[] args) {
        int[] nums = {-14,-12,-5,0,3,7,9,12,15,18,22,27,30};

        int ans = findPeakElement(nums);
        System.out.println("Peak index: " + ans);
        System.out.println("Peak value: " + nums[ans]);
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;        // peak is on left side
            } else {
                start = mid + 1; // peak is on right side
            }
        }
        return start; // start == end → peak index
    }
}


    
