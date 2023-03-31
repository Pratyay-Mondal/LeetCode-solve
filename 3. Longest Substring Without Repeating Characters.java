class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, maximum=0;
        
        HashSet<Character> hs = new HashSet<>();

        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
                maximum = Math.max(maximum, hs.size());
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }

    return maximum;

    }
}
