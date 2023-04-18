
class Solution {
    public String mergeAlternately(String Word1, String Word2) {

        String ans = "";
        int i=0;

        while(i<Word1.length() && i<Word2.length()){
            ans += Word1.charAt(i);
            ans += Word2.charAt(i);
            i++;
        }

        while(i<Word1.length()){
            ans += Word1.charAt(i);
            i++;
        }

        while(i<Word2.length()){
            ans += Word2.charAt(i);
            i++;
        }
    return ans;
    }
}


//--------------------------Another Short Approach--------------------------------

class Solution {
    public String mergeAlternately(String Word1, String Word2) {

        String ans = "";
        int i=0, j=0;

        while(i<Word1.length() || j<Word2.length()){
            if(i<Word1.length()){
                ans += Word1.charAt(i);
                i++;
            }

            if(j<Word2.length()){
                ans += Word2.charAt(j);
                j++;
            }
        }

       
    return ans;
    }
}
