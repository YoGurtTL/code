package src;

public class sortedSquares {
//    public int[] sortedSquares(int[] nums) {
//        for(int i =0 ;i <nums.length;i++){
//              nums[i]=nums[i]*nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//    }

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int negative = -1;
        for (int i=0;i<n;++i){
            if(nums[i]<0){
                negative=i;
            }else{
                break;
            }
        }
        int[] ans = new int[n];
        int index =0,  i= negative,j=negative+1;
        while (i>=0 || j <n){
            if(i<0){
                ans[index]=nums[j]*nums[j];
                ++j;
            }else if (j==n){
                ans[index]=nums[i]*nums[i];
                --i;
            }else if (nums[i]*nums[i] <nums[j] * nums[j]){
                ans[index]=nums[i]*nums[i];
                --i;
            }else{
                ans[index]=nums[j]*nums[j];
                ++j;
            }
            ++index;
        }
        return ans;
    }

    public static void main(String[] args) {
        sortedSquares s =new sortedSquares();
        int[] nums = {-4,-1,0,3,10};
        int[] ans = s.sortedSquares(nums);
    }
}
