class Solution {
    public List<String> partitionString(String s) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> ans = new ArrayList<>();
        ans.add(String.valueOf(s.charAt(0)));
        map.put(String.valueOf(s.charAt(0)),1);
        String current="";
        int i=1;
        while(i<s.length())
            {
                current+=String.valueOf(s.charAt(i));
                if(!map.containsKey(current))
                {
                    ans.add(current);
                    map.put(current,1);
                    current="";
                }
                i++;
            }
        return ans;
    }
}