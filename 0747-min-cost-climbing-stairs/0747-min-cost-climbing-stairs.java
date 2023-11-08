class Solution {
    public int minCostClimbingStairs(int[] cost) {
        if(cost.length==2) return Math.min(cost[0],cost[1]);
        
        int twoStepBack=cost[0];
        int oneStepBack=cost[1];
        int currStep=0;
        for(int i=2;i<cost.length;i++)
        {
            currStep=cost[i]+Math.min(twoStepBack,oneStepBack);
            twoStepBack=oneStepBack;
            oneStepBack=currStep;
        }
        return Math.min(twoStepBack,oneStepBack);
    }
}