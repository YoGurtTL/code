package src;

public class searchInsert {
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int mid =0;
        while (right>=left){
            mid = left+(right-left)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                return  mid;
            }
        }
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        return left;
    }

    public static void main(String[] args) {
        searchInsert si = new searchInsert();
        int [] ss= {1,3,5,6};
        int a =si.searchInsert(ss,7);
    }
}
