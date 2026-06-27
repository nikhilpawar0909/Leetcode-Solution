class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];

        right[n - 1] = height[n - 1];
        left[0] = height[0];

        int maxLeft = height[0];
        for(int i = 1; i < n; i++){
            maxLeft = Math.max(maxLeft, height[i]);
            left[i] = maxLeft;
        }

        int maxRight = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            maxRight = Math.max(maxRight, height[i]);
            right[i] = maxRight;
        }

        int area = 0;
        for(int i = 0; i < n; i++){
           area += Math.min(left[i], right[i]) - height[i];
        }

        return area;
    }
}