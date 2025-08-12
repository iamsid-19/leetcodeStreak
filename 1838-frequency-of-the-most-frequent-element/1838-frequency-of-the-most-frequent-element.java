class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,r=0;
        long res=0,t=0;
        while(r<nums.length)
        {
            t+=nums[r];
            while(nums[r]*(r-l+1L)>t+k)
            {
                t-=nums[l];
                l+=1;
            }
            res=Math.max(res,(r-l+1L));
            r+=1;
        }
        return (int) res;
    }
}