package hard;

/**
 * @author 郭朝彤
 * @date 2017/12/11.
 */
public class H042_trappingRainWater {
    public static int trap(int[] height) {
        if(height.length < 3){
            return 0;
        }
        int i = 1, j = height.length-2;
        for(; i < height.length; i++){
            if(height[i] < height[i-1]){
                break;
            }
        }
        for(; j > 0; j--){
            if(height[j] < height[j+1]){
                break;
            }
        }
        int leftHeightIndex = i-1;
        int rightHeightIndex = j+1;
        int totalLeft = 0;
        int totalRight = 0;
        int newLeft = 0;
        int newRight = 0;
        int last = 0;
//        while(leftHeightIndex < rightHeightIndex){
//            totalLeft += newLeft;
//            leftHeightIndex = i;
//            newLeft = 0;
//            totalRight += newRight;
//            rightHeightIndex = j;
//            newLeft = 0;
//
//            while(height[i] < height[leftHeightIndex]){
//                newLeft = newLeft + height[leftHeightIndex] - height[i];
//                i++;
//            }
//            while(height[j] < height[rightHeightIndex]){
//                newRight += height[rightHeightIndex] - height[j];
//                j++;
//            }
//            i++;j--;
//        }
        for(; leftHeightIndex < rightHeightIndex; i++, j--){
            if(height[i] < height[leftHeightIndex]){
                newLeft = newLeft + height[leftHeightIndex] - height[i];
            }else {
                totalLeft += newLeft;
                leftHeightIndex = i;
                last = newLeft;
                newLeft = 0;
            }
            if(height[j] < height[rightHeightIndex]){
                newRight += height[rightHeightIndex] - height[j];
            } else {
                totalRight += newRight;
                rightHeightIndex = j;
                newRight = 0;
            }
        }
        if(leftHeightIndex == rightHeightIndex){
            return totalLeft + totalRight;
        }
        return totalLeft + totalRight - last;
    }

    public static void main(String[] args){
        int[] height = {2,1,3,1,3,1,2};
        System.out.println(trap(height));
    }
}
