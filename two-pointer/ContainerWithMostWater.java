public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int maxArea = 0;

        while(right > left){
            int currentArea = Math.min(height[left], height[right]) * (right-left);

            maxArea = Math.max(maxArea, currentArea);

            if(height[right] <= height[left]){
                right--;
            }
            else{
                left++;
            }
        }

        return maxArea;
    }    
}
