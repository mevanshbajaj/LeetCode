
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 0 , end = n;
        int mid = start + (end-start)/2;
        if(firstBadVersion(mid)) mid = start + 1;
        else end = start - 1;
        return start;
    }
}