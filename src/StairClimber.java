/**
 * Created by Daniel Killen on 25/06/2024
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 **/
public class StairClimber {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(45));
    }

    public static int recursiveClimbStairs(int n)
    {
        if (n == 1 || n == 0)
        {
            return 1;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static int climbStairs(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
