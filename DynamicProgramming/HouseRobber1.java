public class HouseRobber1 {
    static int solveUntill(int indx, int arr[], int dp[]){
        if(indx < 0) return 0;
        if(indx == 0) return arr[0];
        if(dp[indx] != -1) return dp[indx];
        
        int pick = arr[indx] + solveUntill(indx-2, arr,dp);
        int notPick = 0 + solveUntill(indx - 1, arr, dp);
        
        return dp[indx] = Math.max(pick, notPick);
        
    }
    static int solve(int n, int arr[]){
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return solveUntill(n-1, arr,dp);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        return solve(n,nums);
    }
}
