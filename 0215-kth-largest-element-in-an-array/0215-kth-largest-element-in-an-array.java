class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int num:nums)
        {
            pq.add(num);
            if(pq.size()>k) pq.poll();
        }
        int max=Integer.MAX_VALUE;
         for(int i=0;i<pq.size();i++)
        {
             int cur =pq.poll();
             if(cur<max)
             {
                max=cur;
             }
        }
        return max;
    }
}