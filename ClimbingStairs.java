public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 5; // change input here
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int prev1 = 1; // ways to reach step 1
        int prev2 = 2; // ways to reach step 2

        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return prev2;
    }
}
