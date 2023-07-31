// 1st approach

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        HashMap<Integer, String> hm = new HashMap<>();

        for(int i=0; i<names.length; i++){
            hm.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] res = new String[names.length];
        int j=0;
        
        for(int i=names.length-1; i>=0; i--){
            res[j] = hm.get(heights[i]);
            j++;
        }

        return res;
    }
}




// 2nd approach

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        HashMap<Integer, String> hm = new HashMap<>();

        for(int i=0; i<names.length; i++){
            hm.put(heights[i], names[i]);
        }

        TreeMap<Integer, String> tm = new TreeMap<>(hm);
        
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();

        String[] res = new String[names.length];
        int i=0;
        

        for(Map.Entry<Integer, String> entry : entries){
            res[i] = entry.getValue();
            i++;
        }

        
        String[] rev = new String[names.length];
        int j=0;

        for(i=names.length-1; i>=0; i--){
            rev[j] = res[i];
            j++;
        }

        return rev;
    }
}




