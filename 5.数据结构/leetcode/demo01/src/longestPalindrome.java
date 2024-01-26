public class longestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length()==0){
            return null;
        }
        int maxLen =1;
        int maxIndex =0;
        int currentIndex=0;
        int left=0;
        int right=0;
        for (int i=0;i<s.length();i++) {
            currentIndex = left = right = i;
            while (left != 0) {
                if (s.charAt(left - 1) == s.charAt(currentIndex)) {
                    left--;
                } else {
                    break;
                }
            }
            while (right != s.length() - 1) {
                if (s.charAt(right + 1) == s.charAt(currentIndex)) {
                    right++;
                } else {
                    break;
                }
            }
            while (left != 0 && right != s.length() - 1) {
                if (s.charAt(left - 1) == s.charAt(right + 1)) {
                    left--;
                    right++;
                } else {
                    break;
                }
            }
            if(right-left+1>maxLen){
                maxLen=right-left+1;
                maxIndex=left;
            }
        }
        return s.substring(maxIndex,maxIndex+maxLen);
    }

    public static void main(String[] args) {
        longestPalindrome s = new longestPalindrome();
        s.longestPalindrome("babad");
    }
}

