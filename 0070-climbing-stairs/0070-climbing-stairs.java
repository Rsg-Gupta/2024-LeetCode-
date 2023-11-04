class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return findTotalWays(n,dp);

    }

    public int findTotalWays(int n, int dp[])
    {
        if(n==0) return 1;
        if(n<0) return 0;

        if(dp[n]!=-1) return dp[n];
        //take one step
       int oneStep= findTotalWays(n-1,dp);
        //take two step
        int twoStep=findTotalWays(n-2,dp);
        dp[n]=oneStep+twoStep;
        return dp[n];

    }
}