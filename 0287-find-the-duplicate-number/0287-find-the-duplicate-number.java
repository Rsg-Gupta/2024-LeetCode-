class Solution {
    public int findDuplicate(int[] nums) {
         int n=nums.length;
         int result=-1;
        for(int i=0;i<n;i++)
        {
            nums[nums[i]%n]+=n;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]/n > 1) 
            {
                result=i;
                break;
            }
        }
        return result;
    }
}