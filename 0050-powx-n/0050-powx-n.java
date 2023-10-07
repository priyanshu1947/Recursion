class Solution {
    public double myPow(double x, long n) {
        if(n==0)
        {
            return 1.0;
        }
        if(n<0)
        {
            x=1/x;
            n = -n;
        }

        double ans = 1.0;
        while(n>0)
        {
            if((n&1)!=0)
            {
                ans = ans*x;
            }
            x=x*x;
            n=n>>1;
        }
        return ans;
    }
}