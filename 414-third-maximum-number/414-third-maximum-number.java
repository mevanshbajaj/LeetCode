
class Solution {
    public int thirdMax(int[] arr) {
        long lar = Long.MIN_VALUE;
        long sl = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : arr) {
            if (num == lar || num == sl || num == third) {
                continue;
            }
            if (num > lar) {
                third = sl;
                sl = lar;
                lar = num;
            } else if (num > sl) {
                third = sl;
                sl = num;
            } else if (num > third) {
                third = num;
            }
        }
        if (third == Long.MIN_VALUE) return (int) lar;
        else return (int) third;
    }
}
