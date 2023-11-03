class Solution {
    public int hIndex(int[] citations) {
        
        int len = citations.length;
        int[] count = new int[len+1];

        for(int i : citations){
            if(i > len)
                count[len]++;
            else
                count[i]++;   
        }

        int total = 0;
        for(int i=len; i>0; i--){
            total += count[i];
            if(total >= i)
                return i;

        }

        return 0;
    }
}
