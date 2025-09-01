class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list =  new ArrayList<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]) && map.get(nums[i])>nums.length/3)
            {
                list.add(nums[i]);
                map.remove(nums[i]);
            }
        }
        return list;
    }
}