class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, sum=0;
        
        HashSet<Character> hs = new HashSet<>();

        while(j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
                sum=Math.max(sum, hs.size());
            }
            else{
                hs.remove(s.charAt(i));
                i++;
            }
        }

    return sum;

    }
}
