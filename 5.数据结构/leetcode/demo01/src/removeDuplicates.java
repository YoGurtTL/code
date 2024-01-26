package src;

public class removeDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n==0){
            return 0;
        }
        int fast = 1,slow =1;
        while (fast<n){
            if(nums[fast]!=nums[fast-1]){
                nums[slow]=nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

    public static void main(String[] args) {
        removeDuplicates d1 = new removeDuplicates();
        int[] nums = {1,1,2};
        System.out.println(d1.removeDuplicates(nums));
    }
}
