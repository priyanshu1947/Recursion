public class countzeros {
    public static void main(String[] args) {
        System.out.println(count(12006001));
    }
    static int count = 0;
    static int count(int n)
    {
        return count2(n,0);
    }
    private static int count2(int n, int c)
    {
        if(n==0)
        {
            return c;
        }
        int rem = n%10;
        if(rem == 0)
        {
            return count2(n/10,c+1);
        }
        return count2(n/10,c);
    }
}
