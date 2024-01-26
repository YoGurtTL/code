public class BinarySearch {
        public int search(int[] nums, int target) {
            int left =0;
            int right=nums.length-1;
            while (right>=left){
                int media = left+(right-left)/2;
                if(nums[media]>target){
                    right=media-1;
                }else if(nums[media]<target){
                    left=media+1;
                }else{
                    return media;
                }
            }
            return -1;
        }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int [] nums = {-1,0,3,5,9,12};
        System.out.println(bs.search(nums,2));
    }
}
