class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int total = m+n;

        int[] arr = new int[m+n];
        double sum=0; 

        for(int i=0; i<m; i++){
            arr[i] = nums1[i];
        }

        int j =0;
        for(int i=m; i<total; i++){
            arr[i] = nums2[j];
            j++;
        }
        Arrays.sort(arr);

        if(total % 2 == 1){
            return arr[total/2];
        }
        else{
            return ((double)(arr[total/2 -1]) + (double)(arr[total/2]))/2;
        }
    }
}


