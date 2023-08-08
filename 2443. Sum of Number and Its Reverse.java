class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        int n = num;

        while(n>=0){
            String str = Integer.toString(n);
            String rev = new StringBuilder(str).reverse().toString();

            if(Integer.valueOf(str) + Integer.valueOf(rev) == num){
               return true;
            }
           n--;
        }

        return false;
    }
}
