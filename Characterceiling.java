public class Characterceiling {
    public static void main(String[] args) {
        Solution sol = new Solution();

        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        char result = sol.nextGreatestLetter(letters, target);
        System.out.println(result);   // Expected output: f
    }
}

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Wrap around if no greater character found
        return letters[start % letters.length];
    }
}
