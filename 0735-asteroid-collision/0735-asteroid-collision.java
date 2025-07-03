class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<asteroids.length;i++)
        {
            int cur =asteroids[i];
            if(cur>0 || arr.isEmpty() )
            {
                arr.add(cur);
            }
            else{
                while(!arr.isEmpty() && arr.get(arr.size()-1)>0)
                {
                    int last =arr.get(arr.size()-1);
                    if(last<-cur)
                    {
                        arr.remove(arr.size()-1);
                        continue;
                    }
                    else if(last ==-cur)
                    {
                        arr.remove(arr.size()-1);
                        cur=0;
                    }else{
                        cur=0;
                        break;
                    }
                }
                if (cur != 0) {
                    arr.add(cur); 
                }
            }
        }
        int[] ans = new int [arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}