package src;

import java.util.ArrayList;

public class TwoNumSum {
    public static void main(String[] args) {
            TwoNumSum t1 = new TwoNumSum();
            int [] nums= {3,2,4};
            t1.twoSum(nums,6);
    }

    public int[] twoSum(int[] nums, int target) {
        int [] temp01 = new int[2];
        boolean falg = false;
        for (int i =0 ; i<nums.length;i++){
           int temp = target-nums[i];
           for (int j =0 ;j<nums.length;j++){
               if(temp == nums[j] && i !=j){
                    temp01[0]=i;
                    temp01[1]=j;
                    falg=true;
                    break;
               }
           }
           if (falg==true){
               break;
           }
        }
        return temp01;
    }
}
