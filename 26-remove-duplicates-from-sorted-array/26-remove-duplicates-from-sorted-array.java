
class Solution {
    public int removeDuplicates(int[] arr) {
        int unique = 0;
        for(int scan=1;scan<arr.length;scan++){
            if(arr[scan] != arr[unique]){
                unique++;
                arr[unique] = arr[scan];
            }
        }
        return unique+1;
    }
}