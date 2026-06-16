class Solution {
    public int[] twoSum(int[] n, int target) {
        int res[]=new int[2];
        for(int i=0;i<n.length;i++)
        {
            for(int j=i+1;j<n.length;j++)
            {
                if(n[i]+n[j]==target)
                {
                    res[0]=i+1;
                    res[1]=j+1;
                    return res;
                }
            }
        }
        return res;
    }
}
