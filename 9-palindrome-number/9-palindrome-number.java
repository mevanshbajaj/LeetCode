class Solution {
    public boolean isPalindrome(int x) {
    if(x<0) return false;
    int n=x;
    int m=0;
    int rem=0;
    while(x>0){
        rem=x%10;
        m=m*10+rem;
        x=x/10;
    }
    if(n==m) return true;
    return false;
    }
}