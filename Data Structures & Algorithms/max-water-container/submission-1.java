class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int max=0;
        int left=0;
        int right=n-1;
        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int w=right-left;
            int a=h*w;

            max=Math.max(a,max);
            if(heights[left]<heights[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
