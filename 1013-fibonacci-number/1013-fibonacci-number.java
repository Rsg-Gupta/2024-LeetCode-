class Solution {
    public int fib(int n) {
        int prev=0;
        int ans=0;
        for(int i=0;i<=n;i++)
        {
          if(i==0) prev=0;
          if(i==1) prev=1;
          
          int temp=ans;
          ans=prev+ans;
          prev=temp;
         }
         return ans;
    }
}