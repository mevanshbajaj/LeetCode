
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int a = word1.length();
        int b = word2.length();
        int i = 0, j = 0;
        StringBuilder ans = new StringBuilder();
        while (i < a && j < b) {
            ans.append(word1.charAt(i++));
            ans.append(word2.charAt(j++));
        }
        while (i < a) {
            ans.append(word1.charAt(i++));
        }
        while (j < b) {
            ans.append(word2.charAt(j++));
        }
        return ans.toString();
    }
}