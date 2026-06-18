
class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Base case: empty string has a length of 0
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        // 'right' expands the sliding window
        for (int right = 0; right < s.length(); right++) {
            // Shrink the window from the left until the duplicate character is removed
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the current character and track the max length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
