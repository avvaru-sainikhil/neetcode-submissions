class Solution {
    public boolean isAnagram(String s, String t) {
        char c1[]=s.toCharArray();
        Arrays.sort(c1);
        char c2[]=t.toCharArray();
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
