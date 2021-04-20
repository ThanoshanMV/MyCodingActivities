/*
Runtime: 12 ms, faster than 97.73% of Java online submissions for First Bad Version.
Memory Usage: 35.5 MB, less than 69.87% of Java online submissions for First Bad Version.
*/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int firstBadVersion = -1;
        int low = 0; 
        int high = n;
        int mid;
        while(low <= high){
            mid = high - (high-low)/2;
            if(isBadVersion(mid)){
                // first bad version could be in first half
                high = mid-1;
            }
            else{
                // check second half
                low = mid+1;
            }
        }
        return low;
    }
}