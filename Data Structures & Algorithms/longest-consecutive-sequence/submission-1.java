class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int curr=1,lng=1;
        for(int i=0;i<nums.length-1;i++)
        {
             if(nums[i+1]==nums[i] )
            {
            continue;}

            if(nums[i+1]-nums[i]==1 )
            {
            curr++;}
            else
            {
                lng=Math.max(lng,curr);
                curr=1;
            }
        }
        return Math.max(lng,curr);
    }
}
