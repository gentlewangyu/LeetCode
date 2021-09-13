package api.java.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> list = threeSum.threeSum(nums);
        System.out.println(list);
    }

    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums);
       for (int i=0; i<nums.length-2; i++) {
           for (int j=i+1; j<nums.length-1; j++) {
               for (int k=j+1; k<nums.length; k++) {
                   int temp = nums[i] + nums[j];
                   if (temp > 0) {
                       return list;
                   }
                   if (nums[k] != (0 - temp)) {
                       continue;
                   } else {
                       List<Integer> tempList = new ArrayList<>();
                       tempList.add(nums[i]);
                       tempList.add(nums[j]);
                       tempList.add(nums[k]);
                       list.add(tempList);
                   }
               }
           }
       }
       return list;
    }
}
