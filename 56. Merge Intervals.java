class Solution {
    public int[][] merge(int[][] intervals) {
        
        if(intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

        List<int[]> res = new ArrayList<>();
        int[] temp = intervals[0];

        res.add(temp);

        for(int[] interval : intervals){
            if(interval[0] <= temp[1]){
                temp[1] = Math.max(temp[1], interval[1]);
            }
            else{
                temp=interval;
                res.add(temp);
            }
        }

        return res.toArray(new int[res.size()][2]);

    }
}
