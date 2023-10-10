class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();

        function(0,s,ds,res);
        return res;
        
    }
    void function(int index, String s,List<String> ds, List<List<String>> res)
    {
        if(index==s.length())
        {
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index;i<s.length();++i)
        {
            if(isPalindrome(s,index,i))
            {
                ds.add(s.substring(index,i+1));
                function(i+1,s,ds,res);
                ds.remove(ds.size()-1);
            }
        }
    }

    boolean isPalindrome(String s, int start, int end)
    {
        while(start<=end)
        {
            if(s.charAt(start++)!= s.charAt(end--))
            return false;
        }
        return true;
    }
}