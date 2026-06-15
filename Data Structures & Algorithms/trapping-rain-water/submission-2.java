class Solution {
    public int trap(int[] h) {
        int i=0;
        int j=h.length-1;
        int total=0,maxl=0,maxr=0;
        while(i<=j)
        {
             maxl=Math.max(h[i],maxl);
             maxr=Math.max(h[j],maxr);
            if(maxl<maxr)
            {
                total+=maxl-h[i];
                i++;
            }
           else
            {
                total+=maxr-h[j];
                j--;
            }
        }
        return total;
    }
}
