class Solution {
    public boolean isPalindrome(String s) {
      
        s=s.toLowerCase();
        HashSet<Character> hs = new  HashSet<>();

        for(char c = 'a'; c<='z'; c++){
            hs.add(c);
        }
     
        hs.add('0');
        hs.add('1');
        hs.add('2');
        hs.add('3');
        hs.add('4');
        hs.add('5');
        hs.add('6');
        hs.add('7');
        hs.add('8');
        hs.add('9');
        

        String s1="";
        for(char c : s.toCharArray()){
            if(hs.contains(c))
                s1 = s1 + c;
        }

        String rev="";
        for(int i=s1.length()-1; i>=0; i--){
            rev = rev + s1.charAt(i);
        }

        if(s1.equals(rev))
            return true;
        else
            return false;

    }
}
