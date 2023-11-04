class Solution {
    public int tribonacci(int n) {
        
        int a=0;
        int b=1;
        int c=1;
        // int ans;
        if(n==0) return a;
        if(n==1||n==2) return b;
        int ans=0;
        for(int i=3;i<=n;i++)
          {
              int temp=c;
              c=a+b+c;
              a=b;
              b=temp;
          }
        return c;
    }
}