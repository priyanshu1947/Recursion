class Solution {
    private void solve(int ind, int n, int k, int t, List<List<Integer>> ans, List<Integer> ls)
    {
        if(k<0 || t<0)
        {
            return;
        }
        if(ind>n)
        {
            if(t==0 && k==0)
            {
                ans.add(new ArrayList<>(ls));
            }
            return;
        }
        if(t>=ind)
        {
            ls.add(ind);
            solve(ind+1,n,k-1,t-ind,ans,ls);
            ls.remove(ls.size()-1);
        }
        solve(ind+1,n,k,t,ans,ls);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
         List<Integer> ls = new ArrayList<>();
        solve(1,9,k,n,ans,ls);

        return ans;
    }
}