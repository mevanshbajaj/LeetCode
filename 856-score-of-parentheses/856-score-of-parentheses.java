
class Solution {
    public int scoreOfParentheses(String s) {
        int score = 0 , dep = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') dep++;
            else{
                dep--;
                if(s.charAt(i-1) == '(') score += 1 << dep;
            }
        }
        return score;
    }
}