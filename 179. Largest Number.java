class Solution {
    public String largestNumber(int[] nums) {
    
        String[] strs = new String[nums.length];

        for(int i=0; i<nums.length; i++){
            strs[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strs, (s1, s2) -> ((s2+s1).compareTo(s1+s2)));

        String res = String.join("", strs);

        if(res.isEmpty() || res.charAt(0)=='0'){
            return "0";
        }

        return res;
        
    }
}
