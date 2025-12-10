class Solution {
    public List<List<Integer>> permute(int[] nums) {
      List<List<Integer>> ans = new ArrayList<>();
      backtrack(0, nums, ans);
      return ans;
    }

    public static void backtrack(int index, int[] nums, List<List<Integer>> ans)
    {
        if(index == nums.length)
        {
           List<Integer> temp = new ArrayList<>();
           for(int num : nums)
           {
                temp.add(num);
           }
        //    ans.add(temp);
        //         return; 

            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=index; i<nums.length; i++)
        {
            swap(nums, i, index);
            backtrack(index+1, nums, ans);
            swap(nums, i, index);
        }
    }

    public static void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}