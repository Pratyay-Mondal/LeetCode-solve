class Solution {
    public String decodeString(String s) {
        
        Stack<Character> stk = new Stack<>();

        for(char c : s.toCharArray()){
            if(c != ']')
                stk.push(c);

            else{
                StringBuilder sb = new StringBuilder();
                while(!stk.empty() && Character.isLetter(stk.peek()))
                    sb.insert(0, stk.pop());
                
                String sub = sb.toString();
                stk.pop();

                sb = new StringBuilder();
                while(!stk.isEmpty() && Character.isDigit(stk.peek()))
                    sb.insert(0, stk.pop());

                int count = Integer.valueOf(sb.toString());    

                while(count > 0){
                    for(char ch : sub.toCharArray())
                        stk.push(ch);
                    count--;  
                }
            }
        }

        StringBuilder res = new StringBuilder();
        while(!stk.isEmpty())
            res.insert(0, stk.pop());

        return res.toString();

    }
}
