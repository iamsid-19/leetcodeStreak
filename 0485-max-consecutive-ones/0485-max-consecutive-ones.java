class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, r=0, l=0;
        while(r<nums.length)
        {
            if(nums[r]==1)
            {
                max=Math.max(max,r-l+1);
            }
            else{
                
                l=r+1;
            }
            r++;
        }
        return max;

    }
}