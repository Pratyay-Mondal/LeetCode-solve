class Solution {
    public String reverseVowels(String s) {

        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        char[] arr = s.toCharArray();

        int i=0, j=arr.length-1;

        while(i < j){
            if(!set.contains(arr[i])){
                i++;
            }
            else if(!set.contains(arr[j])){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        return new String(arr);

    }
}
