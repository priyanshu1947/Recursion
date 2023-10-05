public class sumdigit
{
    public static void main(String[] args) {
int ans = sumdigit(1345);
        System.out.println(ans);
    }
    static int sumdigit(int n )
    {
        if(n==1)
        {
            return 1;
        }
        return (n%10)+ sumdigit(n/10);
    }

}
