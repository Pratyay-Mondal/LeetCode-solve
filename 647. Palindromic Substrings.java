class Solution {
    
    int ans = 1;

    public int countSubstrings(String s) {

        for(int i=0; i<s.length()-1; i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);            
        }

        return ans;
    }


    void palindrome(String s, int i, int j){
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            ans++;
            i--;
            j++;
        }
    }
    
}
