public class findMedianSortedArrays {
//    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
//        int [] nums= new int[nums1.length+nums2.length];
//        int i =0;
//        int j =0;
//        int k =0;
//        while(i< nums1.length || j<nums2.length){
//                if(i>=j && j==nums2.length) {
//                    nums[k]=nums1[i];
//                    i++;
//                }else if(j>=i && i==nums1.length){
//                    nums[k]=nums2[j];
//                    j++;
//                }else if (j>i && j==nums2.length){
//                    nums[k]=nums1[i];
//                    i++;
//                }else if(i>j && i==nums1.length){
//                    nums[k]=nums2[j];
//                    j++;
//                }
//                else if(nums1[i]<=nums2[j]){
//                    nums[k] = nums1[i];
//                    i++;
//                }else{
//                    nums[k]= nums2[j];
//                    j++;
//                }
//            k++;
//        }
//        if(nums.length%2==0){
//            return (nums[nums.length/2-1]+nums[nums.length/2])/2.0;
//        }
//        return nums[nums.length/2];
//    }
    public double findMedianSortedArrays(int num1[],int num2[]){
        int m = num1.length;
        int n = num2.length;
        int len = m+n;
        int left =-1,right =-1;
        int astart = 0,bstart=0;
        for (int i =0;i<=len/2;i++){
            left= right;
            if (astart <m && (bstart>=n || num1[astart]<num2[bstart])){
                    right=num1[astart++];
            }else {
                   left = num2[bstart++];
            }
        }
        if((len & 1)==0){
            return (left+right)/2.0;
        }
        return right;
    }
    public static void main(String[] args) {
        findMedianSortedArrays s = new findMedianSortedArrays();
        int [] num1={3};
        int [] num2={-2,-1};
        double value= s.findMedianSortedArrays(num1,num2);
        System.out.println(value);
    }
}
