class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        int total =0;
        int count =0;
        int start =0;

        for(int i=0; i<n; i++){
            total = total + gas[i] - cost[i];
            count = count + gas[i] - cost[i];

            if(count < 0){
                count = 0;
                start = i+1;
            }
        }

        if(total < 0)
            return -1;
        else
            return start;    
    }
}
