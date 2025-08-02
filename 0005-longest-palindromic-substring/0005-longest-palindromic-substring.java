class Solution {
    public String longestPalindrome(String st) {
        int max=0;
        String ans ="";
        for(int i=0;i<st.length();i++)
        {
            for(int j=i;j<st.length();j++)
            {
                String sub = st.substring(i,j+1);
                if(isPalin(sub) && sub.length()>max)
                {
                    ans=sub;
                    max=sub.length();
                }
            }
        }
       
        return ans;
    }
    public boolean isPalin(String str)
    {
        int st =0 , et=str.length()-1;
        if(str.length()==1)
        return true;
        while(st<et)
        {
            if(str.charAt(st)!=str.charAt(et))
            {
                return false;
            }
            st++;
            et--;
        }
        return true;
    }
}