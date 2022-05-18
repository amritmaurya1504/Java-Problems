import java.util.Arrays;

//* Problem Statement.

// Given a number of stairs and a frog, the frog wants to climb from the 0th stair to the (N-1)th stair. At a time the frog can climb either one or two steps. A height[N] array is also given. Whenever the frog jumps from a stair i to stair j, the energy consumed in the jump is abs(height[i]- height[j]), where abs() means the absolute difference. We need to return the minimum energy that can be used by the frog to jump from stair 0 to stair N-1.

class Frog_Jump_DP3 {
    // Memoization
    // public static int solve(int indx, int[] height, int[] dp){
    // if(indx == 0) return 0;
    // if(dp[indx] != -1) return dp[indx];
    // int jumpTwo = Integer.MAX_VALUE;
    // int jumpOne = solve(indx-1, height, dp) + Math.abs(height[indx] -
    // height[indx-1]);

    // if(indx > 1){
    // jumpTwo = solve(indx - 2, height, dp) + Math.abs(height[indx] -
    // height[indx-2]);
    // }

    // return dp[indx] = Math.min(jumpOne, jumpTwo);

    // }
    // public static void main(String[] args) {
    // int height[] = { 30,10,60 , 10 , 60 , 50 };
    // int n = height.length;
    // int dp[] = new int[n];
    // Arrays.fill(dp, -1);
    // System.out.println(solve(n-1, height, dp));
    // }

    // Tabular
    // public static void main(String[] args) {
    //     int height[] = { 30, 10, 60, 10, 60, 50 };
    //     int n = height.length;
    //     int dp[] = new int[n];
    //     Arrays.fill(dp, -1);
    //     dp[0] = 0;
    //     for (int i = 1; i < n; i++) {
    //         int jumpTwo = Integer.MAX_VALUE;
    //         int jumpOne = dp[i - 1] + Math.abs(height[i] - height[i - 1]);
    //         if (i > 1)
    //             jumpTwo = dp[i - 2] + Math.abs(height[i] - height[i - 2]);

    //         dp[i] = Math.min(jumpOne, jumpTwo);
    //     }
    //     System.out.println(dp[n - 1]);
    // }

    // Tabular + Space optimized
    public static void main(String[] args) {
        int height[] = { 30, 10, 60, 10, 60, 50 };
        int n = height.length;
        
        int prev = 0;
        int prev2 = 0;
        for (int i = 1; i < n; i++) {
            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne = prev + Math.abs(height[i] - height[i - 1]);
            if (i > 1)
                jumpTwo = prev2 + Math.abs(height[i] - height[i - 2]);

            int curi = Math.min(jumpOne, jumpTwo);
            prev2 = prev;
            prev = curi;
        }
        System.out.println(prev);
    }

    
}