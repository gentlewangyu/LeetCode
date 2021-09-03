package api.java.array;

public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = area.maxArea(height);
        int maxArea2 = area.maxArea2(height);
        System.out.println("method maxArea; maxArea: " + maxArea
                + "; 时间复杂度o(n2),空间复杂度o(1)");
        System.out.println("method maxArea2; maxArea: " + maxArea2
                + "; 时间复杂度o(n),空间复杂度o(1)");
    }

    public int maxArea(int[] height) {
       int length = height.length;
       int maxArea = 0;
       for (int i = 0; i < length - 1; i++)
           for (int j = i + 1; j < length; j++) {
               maxArea = Math.max(maxArea,
                       (j - i) * Math.min(height[i],height[j]));
           }
       return maxArea;
    }

    public int maxArea2(int[] height) {
        int length = height.length;
        int i = 0, j = length - 1;
        int maxArea = 0;
        while (i < j) {
            maxArea = Math.max(maxArea,
                    (j - i) * Math.min(height[i], height[j]));
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
