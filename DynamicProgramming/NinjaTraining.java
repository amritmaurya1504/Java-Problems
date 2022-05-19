import java.util.Arrays;

public class NinjaTraining {

    // Memoization Method
    // TC-> O(N*4)
    // SC-> O(N) + O(N*4)

    // public static int solve(int day, int last, int[][] points, int[][] dp){
    // if(day == 0){
    // int maxi = 0;
    // for (int i = 0; i <= 2; i++) {
    // if(i != last){
    // maxi = Math.max(maxi, points[0][i]);
    // }
    // }

    // return maxi;
    // }
    // if(dp[day][last] != -1) return dp[day][last];

    // int maxi = 0;
    // for (int i = 0; i <=2; i++) {
    // if(i != last){
    // int point = points[day][i] + solve(day-1, i, points, dp);
    // maxi = Math.max(maxi, point);
    // }
    // }

    // return dp[day][last] = maxi;
    // }

    // public static int ninjaTraining(int n, int[][] points){
    // int[][] dp = new int[n][4];
    // for (int[] is : dp) {
    // Arrays.fill(is, -1);
    // }

    // return solve(n-1, 3, points, dp);

    // }
    // public static void main(String[] args) {
    // int[][] points = { { 10, 40, 70 },
    // { 20, 50, 80 },
    // { 30, 60, 90 } };

    // int n = points.length;
    // System.out.println(ninjaTraining(n,points));
    // }

    // Tabulation Method :-

    public static int ninjaTraining(int n, int[][] points) {
        int[][] dp = new int[n][4];
        dp[0][0] = Math.max(points[0][1], points[0][2]);
        dp[0][1] = Math.max(points[0][0], points[0][2]);
        dp[0][2] = Math.max(points[0][0], points[0][1]);
        dp[0][3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        for (int day = 1; day < n; day++) {
            for (int last = 0; last < 4; last++){
                dp[day][last] = 0;
                for (int task = 0; task <=2 ; task++) {
                    if(task != last){
                        int point = points[day][task] + dp[day-1][task];
                        dp[day][last] = Math.max(dp[day][last], point);
                    }
                }
            }
        }

        return dp[n-1][3];

    }

    public static void main(String[] args) {
        int[][] points = { { 10, 40, 70 },
                { 20, 50, 80 },
                { 30, 60, 90 } };

        int n = points.length;
        System.out.println(ninjaTraining(n, points));
    }
}
