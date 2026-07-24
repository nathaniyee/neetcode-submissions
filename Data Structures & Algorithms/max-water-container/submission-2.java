class Solution {
    public int maxArea(int[] heights) {
        int result = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
           int width = right - left;
           int height = Math.min(heights[left], heights[right]);
           int area = width * height;
           result = Math.max(area, result);


           if (heights[left] < heights[right]) {
                left++;
           } else {
                right--;
           }
        }

        return result;
    }
}
