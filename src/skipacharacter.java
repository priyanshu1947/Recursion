public class skipacharacter
{
    public static void main(String[] args) {
        System.out.println((skipAppapple("bapplefg")));;

    }
    static void skip(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a')
        {
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }

    static String skip(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a')
        {
            return skip(up.substring(1));
        }
        else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipapple(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }

        if(up.startsWith("apple"))
        {
            return skipapple(up.substring(5));
        }
        else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }

    static String skipAppapple(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }

        if(up.startsWith("app")&& !up.startsWith("apple"))
        {
            return skipAppapple(up.substring(3));
        }
        else {
            return up.charAt(0) + skipAppapple(up.substring(1));
        }
    }
}
