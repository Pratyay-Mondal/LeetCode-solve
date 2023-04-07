class Solution {
    public boolean isAnagram(String s, String t) {
    
        char[] ch1 =  s.toCharArray();
        char[] ch2 =  t.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String sorted1 = new String(ch1);
        String sorted2 = new String(ch2);

        if(sorted1.equals(sorted2)){
            return true;
        }
        else
            return false;
    }
}
