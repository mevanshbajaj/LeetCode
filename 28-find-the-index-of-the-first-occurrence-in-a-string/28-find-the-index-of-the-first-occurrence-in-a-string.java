
class Solution {
    public int strStr(String s1, String s2) {
        for(int i=0;i<s1.length();i++){
         if(s1.charAt(i) == s2.charAt(0))
         if(s1.substring(i,s2.length()-1+i).equals(s2)) return i;
        }
        return -1;
    }
}