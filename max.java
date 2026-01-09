import java.util.Arrays;

public class max {

    public static void main(String[] args) {
        int[] arr = {2, 34, 56, 78, 33};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
