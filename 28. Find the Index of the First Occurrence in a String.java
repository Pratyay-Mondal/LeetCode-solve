class Solution {
    public int strStr(String haystack, String needle) {
        
        char[] main = haystack.toCharArray();
        char[] sub = needle.toCharArray();
        int sum;
        int k=0;

        for(int i=0; i<main.length-sub.length+1; i++){
            k=i;
            sum=0;
            for(int j=0; j<sub.length; j++){
                if(sub[j] == main[k]){
                    sum += 1;
                }
                k++;
            }
            if(sum==needle.length()){
                return i;
            }
        }

        return -1;
    }
}
