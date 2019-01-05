/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      // O(log(n)) using binary search
      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 1, end = n;
            while(start < end){
                int mid = (end-start) / 2 + start;
                if(isBadVersion(mid)){
                    end = mid;
                }
                else{
                    start = mid + 1;
                }
            }
            return start;
            
        }
        
    }