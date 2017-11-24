package medium;

/**
 * @author 郭朝彤
 * @date 2017/11/23.
 */
public class M011_containerWithMostWater {
    public static int maxArea(int[] height) {
        int maxValue = 0;
        int area = 0;
        for(int i = 0; i < height.length-1; i++){
            for(int j = i+1; j < height.length; j++){
                System.out.println(i + " " + j);
                area = (j-i) * Math.min(height[i], height[j]);
                System.out.println(area);
                if(maxValue < area){
                    maxValue = area;
                }
            }
        }
        return maxValue;
    }

    public int maxArea2(int[] height){
        int left = 0;
        int right = height.length-1;
        int max = 0;
        int area = 0;
        while (left < right){
            if(height[left] < height[right]){
                area = height[left] * (right - left);
                left++;
            }
            else {
                area = height[right] * (right - left);
                right --;
            }
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args){
        int[] a = {1,2,1};
        System.out.println(maxArea(a));
    }
}
