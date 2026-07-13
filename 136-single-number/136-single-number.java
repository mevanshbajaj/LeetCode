// iterate over array
// xor the array
// return array
class Solution {
    public int singleNumber(int[] arr) {
        int ans = 0;
        for(int num : arr)
        ans ^= num;
        return ans;
    }
}