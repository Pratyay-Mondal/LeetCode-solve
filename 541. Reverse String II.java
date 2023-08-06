class Solution {
    public String reverseStr(String s, int k) {
        
        char[] arr = s.toCharArray();

        int i=0, n=s.length();
        
        while(i < n){
            int j = Math.min(i+k-1, n-1);
            swap(arr, i, j);
            i = i + (2*k);
        }

        return String.valueOf(arr);
    }


    void swap(char[] arr, int i, int j){
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

}
