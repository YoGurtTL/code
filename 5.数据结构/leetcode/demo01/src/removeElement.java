package src;

import java.util.Arrays;

public class removeElement {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0){
            return 0;
        }
        int l =0 ;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=val) {
                nums[l]= nums[r];
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        removeElement e = new removeElement();
        int [] nums={0,1,2,2,3,0,4,2};
        int index= e.removeElement(nums,2);
    }
}
