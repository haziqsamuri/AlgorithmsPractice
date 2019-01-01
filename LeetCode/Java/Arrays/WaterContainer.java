class Solution {
    public int maxAreaBrute(int[] height) {
        int max = 0;
        int area = 0;
        int width = 0;
        for(int i = 0; i < height.length - 1; i++){
            for(int j = 1; j < height.length; j++){
                width = j - i;
                if(height[i] < height[j]){
                  area = height[i] * width;
                }
                 else{
                    area = height[j] * width;
                }
                if(area > max){
                    max = area;
                }
            }
            
        }
        return max;
    }
    public int maxAreaOptimal(int[] height) {
        int startPointer = 0;
        int endPointer = height.length - 1;
        int area = 0, max = 0, width = 0;
        while(startPointer < endPointer){
            width = endPointer - startPointer;
            if(height[startPointer] < height[endPointer]){
                area = height[startPointer] * width;
                startPointer++;
            }
            else{
                area = height[endPointer] * width;
                endPointer--;
            }
            if(area > max){
                max = area;
            }
        }
        return max;
    }
}