class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<(1 << nums.length) ; i++){
            List<Integer> subSet = new ArrayList<>();
             for(int b = 0; b < nums.length; b++){
                 if( (i & (1 << b)) != 0){
                     subSet.add(nums[b]);
                 }
             }
             ans.add(subSet);
        }
        return ans;
    }
}
 
	