
class Solution {
    public String mergeAlternately(String a, String b) {
        int m = a.length() , n = b.length();
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i < m || i < n){
            if(i < n1)
            ans.append(word1.charAt(i));
            if(i < n2)
            ans.append(word2.charAt(i));
            i++;
        }
        return ans.toString();
    }
}