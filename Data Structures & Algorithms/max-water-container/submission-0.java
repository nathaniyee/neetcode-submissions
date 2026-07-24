class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int max = 0;
        for (int left = 0; left < heights.length; left++) {
            for (int right = 0; right < heights.length; right++) {
                int width = right - left;
                int height = Math.min(heights[right], heights[left]);
                area =  width * height;
                max = Math.max(area, max);
            }
        }
        
        return max;
    }
}
