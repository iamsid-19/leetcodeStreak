class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal)-helper(nums,goal-1);
    }
    public int helper(int[] nums,int goal){
        int r=0,l=0,sum=0,res=0;
        for(r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            while(sum>goal && l<=r)
            {
                sum-=nums[l];
                l++;
            }
            res+=r-l+1;
        }
        return res;
    }
}