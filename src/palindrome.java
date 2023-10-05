public class palindrome
{
    public static void main(String[] args) {
        boolean ispalindrome = palin(12341);

        if(ispalindrome)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    static boolean palin(int n)
    {
        return n == rev(n);
    }
    static int sum = 0;

    static int rev(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int rem = n%10;
        sum = sum*10+rem;
        rev(n/10);

        return sum;

    }

}
