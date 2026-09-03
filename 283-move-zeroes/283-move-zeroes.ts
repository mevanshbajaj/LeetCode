
/**
 Do not return anything, modify nums in-place instead.
 */
function moveZeroes(arr: number[]): void {
    let idx = 0;
    for(const x of arr) {
        if(x != 0) arr[idx++] = x;
    }
    while(idx < arr.length) arr[idx++] = 0;
};