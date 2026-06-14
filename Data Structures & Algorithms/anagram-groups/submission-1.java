/*class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li =new ArrayList<>();
        
        for(int i=0;i<strs.length-1;i++)
        {
            for(int j=i+1;j<strs.length;j++)
            {
                boolean isAna=isAnagram(strs[i],strs[j]);
                List<String> inner=new ArrayList<>();
                if(isAna)
                {
                    inner.add(strs[i]);
                    inner.add(strs[j]);
                    li.add(inner);

                }
                else
                {
                    inner.add(strs[i]);
                    li.add(inner);
                }
            }
        }
        return li;
    }
    static boolean isAnagram(String s,String t)
    {
         if(s.length()!=t.length())
        {
            return false;
        }
        char c1[]=s.toCharArray();
        char c2[]=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Handle edge case
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        // Map to store the sorted string as key and the list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert to char array and sort to create the unique key
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            
            // If the key doesn't exist, initialize a new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // Add the original string to the corresponding anagram group
            map.get(key).add(s);
        }
        
        // Return all the grouped lists
        return new ArrayList<>(map.values());
    }
}
