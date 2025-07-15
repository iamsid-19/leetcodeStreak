class Solution {
    public boolean isBalanced(String num) {
        int odd=0,even=0;
        for(int i=0;i<num.length();i++)
        {
            char ch = num.charAt(i);
            if(i%2==0)
            { 
                even +=(ch-'0');
            }
            else{
                odd+=(ch-'0');
            }
        }
        if(odd==even)
        {
            return true;
        }
        return false;
    }
}