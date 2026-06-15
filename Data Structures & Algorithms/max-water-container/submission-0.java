class Solution {
    public int maxArea(int[] h) {
        int width=0;
        int len=0;
        int max=0,curr=0;
        int i=0,j=h.length-1;
        while(i<j)
        {
            width=j-i;
            len=Math.min(h[i],h[j]);
            curr=width*len;
            max=Math.max(curr,max);
            if(h[i]<h[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return max;
    }
}
