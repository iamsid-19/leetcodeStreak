class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int n =tokens.length;
        for(int i=0;i<n;i++)
        {
            String s = tokens[i];
            if(s.equals("+"))
            {
                int a = stk.pop();
                int b= stk.pop();
                stk.push(a+b);
            }
            else if(s.equals("-"))
            {
                 int a = stk.pop();
                int b= stk.pop();
                stk.push(b-a);   
            }
            else if(s.equals("*"))
            {
                      int a = stk.pop();
                int b= stk.pop();
                stk.push(a*b);
            }
            else if(s.equals("/"))
            {
                         int a = stk.pop();
                int b= stk.pop();
                stk.push(b/a);
            }else{
                stk.push(Integer.parseInt(s));
            }
        }
        return stk.pop();
    }
}