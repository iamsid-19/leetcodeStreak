class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0)
        {
            List<Integer> list = new ArrayList<>(Collections.nCopies(rowIndex+1,1));
            return list;
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            List<Integer> list = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++)
            {
                int sum = res.get(i-1).get(j-1)+res.get(i-1).get(j);
                list.set(j,sum);
            }
            res.add(list);
        }
        return res.get(rowIndex);
    }
}