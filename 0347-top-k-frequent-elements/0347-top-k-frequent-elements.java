class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer>map = new HashMap<>();
        int[] arr = new int[k];
        for(int num: nums)
        {
           map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=  new PriorityQueue<>((x,y)->map.get(x)-map.get(y));
        for(int key: map.keySet())
        {
            pq.add(key);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        for(int i=k-1;i>=0;i--)
        {
            arr[i]=pq.poll();
        }
        return arr;
    }
    
}