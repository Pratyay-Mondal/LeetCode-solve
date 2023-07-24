class Solution {
    public int characterReplacement(String s, int k) {
        
        int[] arr = new int[26];

        int count=0, beg=0, len=0; 

        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'A']++;
            count = Math.max(count, arr[s.charAt(i) - 'A']);

            if((i-beg+1-count) > k){
                arr[s.charAt(beg) - 'A']--;
                beg++;
            }

            len = Math.max(len, i-beg+1);
        }

        return len;
    }
}
