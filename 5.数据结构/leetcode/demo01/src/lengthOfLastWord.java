package src;

public class lengthOfLastWord {
    public int lengthOfLastWord(String s) {
       String[] a=  s.split(" ");
       StringBuffer buffer = new StringBuffer();
       buffer.append(a[a.length-1]);
       return buffer.length();
    }

    public static void main(String[] args) {
        lengthOfLastWord last = new lengthOfLastWord();
        int len =  last.lengthOfLastWord("luffy is still joyboy");
        System.out.println(len);
    }
}
