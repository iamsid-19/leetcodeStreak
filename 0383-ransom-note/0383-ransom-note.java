class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<ransomNote.length();i++)
        {
           
            if(map.containsKey(ransomNote.charAt(i)))
            {
                int count = map.get(ransomNote.charAt(i));
                if(count==0)
                {
                    return false;
                }
                map.put(ransomNote.charAt(i),count-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}