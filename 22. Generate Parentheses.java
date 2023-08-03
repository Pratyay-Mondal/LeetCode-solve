class Solution {
    public List<String> generateParenthesis(int n) {
      
        List<String> list = new ArrayList<>();
        genereate("", list, n, n);
        return list;
    }


    void genereate(String sub, List<String> list, int left, int right){
        if(left > right)
            return;

        if(left>0)
            genereate(sub + "(", list, left-1, right);

        if(right>0)
            genereate(sub + ")", list, left, right-1);

        if(left==0 && right==0){
            list.add(sub);
            return;
        }

    }


}
