class Solution:
    def moveZeroes(self, arr: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        idx=0
        for x in arr:
            if x != 0:
                arr[idx] = x
                idx+=1

        while idx < len(arr):
            arr[idx] = 0
            idx += 1
        