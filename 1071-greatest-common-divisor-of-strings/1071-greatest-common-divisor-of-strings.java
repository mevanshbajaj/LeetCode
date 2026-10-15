class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int a = str1.length(), b = str2.length();
        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str1.substring(0, gcd(a, b));
    }
    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
