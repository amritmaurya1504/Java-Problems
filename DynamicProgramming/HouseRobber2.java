public class HouseRobber2 {
    static int solveUntill(int indx, ArrayList<Integer> arr, int dp[]){
        if(indx < 0) return 0;
        if(indx == 0) return arr.get(0);
        if(dp[indx] != -1) return dp[indx];
        
        int pick = arr.get(indx) + solveUntill(indx-2, arr,dp);
        int notPick = 0 + solveUntill(indx - 1, arr, dp);
        
        return dp[indx] = Math.max(pick, notPick);
        
    }
    static int solve(ArrayList<Integer> arr){
        int n = arr.size();
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return solveUntill(n-1, arr,dp);
    }
    public static void main(String[] args) {
        // nums array given
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        int n = nums.length;
        if(n == 1)
            return nums[0];
    
        for(int i=0; i<n; i++){
            if(i!=0) arr1.add(nums[i]);
            if(i!=n-1) arr2.add(nums[i]);
        }
        
        return Math.max(solve(arr1), solve(arr2));
    }
}
