package src;

public class plusOne {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i] = digits[i]%10;
            if(digits[i]!=0){
                return digits;
            }
        }
        digits= new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        plusOne po = new plusOne();
        int [] a = {5,6,2,0,0,4,6,2,4,9};
        po.plusOne(a);
    }
}
