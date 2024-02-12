class Solution {
    public int evalRPN(String[] tokens) {
        
        int temp;
        Stack<Integer> stk = new Stack<>();

        for(String s : tokens){
            if(s.equals("+")){
                stk.add(stk.pop()+stk.pop());
            }
            else if(s.equals("-")){
                temp=stk.pop(); 
                stk.add(stk.pop()-temp);
            }
            else if(s.equals("*")){
                stk.add(stk.pop()*stk.pop()); 
            }
            else if(s.equals("/")){
                temp=stk.pop();
                stk.add(stk.pop()/temp); 
            }
            else{
                stk.add(Integer.parseInt(s));
            }

        }
        return stk.pop();
        
    }
}
