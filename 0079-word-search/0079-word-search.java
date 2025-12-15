class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length, m=board[0].length;
        for(int r=0;r<n;r++)
        {
            for(int c=0;c<m;c++)
            {
                if(board[r][c]==word.charAt(0))
                {
                    if(dfs(board,word,r,c,0))
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][]b, String w, int r, int c,int idx)
    {
        if(idx==w.length())
        {
            return true;
        }
        if(r<0 || r>=b.length||c<0||c>=b[0].length)
        {
            return false;
        }
        if(b[r][c]!=w.charAt(idx))
        {
            return false;
        }
        char ch =b[r][c];
        b[r][c]='#';
        boolean found = dfs(b, w, r + 1, c, idx + 1) ||
                        dfs(b, w, r - 1, c, idx + 1) ||
                        dfs(b, w, r, c + 1, idx + 1) ||
                        dfs(b, w, r, c - 1, idx + 1);
        b[r][c]=ch;
        return found;

    }
}