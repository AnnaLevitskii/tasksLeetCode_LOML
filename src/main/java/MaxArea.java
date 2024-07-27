import java.util.Arrays;

public class MaxArea {
    public static int maxArea(int[] height) {
        int waterMax = 0;
        if(height.length<2) return waterMax;
        if(height.length==2) return Math.min(height[0],height[1]);
        int maxLength = (height.length *(height.length-1))/2;
        for(int i = 0, j=0, k=1; i<maxLength; i++, k++){
            if(k==height.length){
                j++;
                k=j+1;
            }
            int heightW = Math.min(height[j],height[k]);
            int lengthW = Math.abs(k-j);
            if(heightW*lengthW>waterMax){
                waterMax=heightW*lengthW;
            }
        }
        return waterMax;
    }
}
