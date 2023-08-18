class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> res = new ArrayList<>();
        backtracking(res, new ArrayList<>(), n, k, 1);

        return res;
    }

    void backtracking(List<List<Integer>> res, List<Integer> temp, int n, int k, int num){

        if(temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=num; i<=n; i++){
            temp.add(i);
            backtracking(res, temp, n, k, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
