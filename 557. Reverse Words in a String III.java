class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");

        int len = arr.length;

        String[] rev = new String[len];
        
        int j=0;

        for(String s1 : arr){
            String temp = new StringBuffer(s1).reverse().toString();
            rev[j] = temp;
            j++;
        }


        String res = "";

        int k=1;

        for(String s2 : rev){
            res = res + s2;

            if(k<len){
                res = res + " ";
                k++;
            }

        }

        return res;

    }
}
