

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        
        int[] result = new int[k];
        
      for (int i = 0; i < k; i++) {
            int maxKey = -1;
            int maxFreq = -1;
            
          for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxKey = entry.getKey();
                }
            }
            
          result[i] = maxKey;
            
          hm.remove(maxKey);
        }
        
        return result;
    }
}
