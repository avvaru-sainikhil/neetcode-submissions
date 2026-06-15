class Solution {
    public int trap(int[] h) {
        int i=0;
        int j=h.length-1;
        int total=0,minl=0,minr=0;
        while(i<=j)
        {
             minl=Math.max(h[i],minl);
             minr=Math.max(h[j],minr);
            if(minl<minr)
            {
                total+=minl-h[i];
                i++;
            }
           else
            {
                total+=minr-h[j];
                j--;
            }
        }
        return total;
    }
}
