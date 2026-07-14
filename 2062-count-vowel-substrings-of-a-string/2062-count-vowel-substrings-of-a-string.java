class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int ans = 0;
        for(int i=0;i<n;i++){
            boolean[] vowel = new boolean[5];
            int count = 0;
            for(int j = i;j<n;j++){
                char c = word.charAt(j);
                int idx = getIndex(c);
                if(idx == -1) break;
                if(!vowel[idx]){
                    vowel[idx] = true;
                    count++;
                }
                if(count == 5) ans++;
            }
        }
        return ans;
    }
    private int getIndex(char c) {
        switch (c) {
            case 'a': return 0;
            case 'e': return 1;
            case 'i': return 2;
            case 'o': return 3;
            case 'u': return 4;
            default: return -1;
        }
}
}