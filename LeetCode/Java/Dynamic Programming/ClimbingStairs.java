public class Solution {
    // Bottom Up Approach - Same as fibonacci!
    public int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2){
            return n;
        }
        int twoStepsBefore = 1, oneStepBefore = 2, diffRoutes = 0;
        for(int i = 3; i <= n; i++){
            diffRoutes += oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = diffRoutes;
        }
        return diffRoutes;
    }
}