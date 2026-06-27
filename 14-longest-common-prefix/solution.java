class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        String f = strs[0];
        for(int i=0;i<f.length();i++){
            char c = f.charAt(i);
             for(int j = 1;j<strs.length;j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return ans;
        }
    }
       ans += c;
        }
        return ans;
    }
}

