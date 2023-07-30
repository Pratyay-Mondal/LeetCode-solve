// using in-built function

class Solution {
    public int getSum(int a, int b) {
      
        return Integer.sum(a,b);
      
    }
}



// using bit manipulation

class Solution {
    public int getSum(int a, int b) {
        
        int sum=0;

        while(b != 0){
            sum = (a & b);
            a = a ^ b;
            b = (sum)<<1;
        }

        return a;

    }
}
