package src;

public class reverse {
//    public int reverse(int x) {
//        int num=0;
//        Integer x1 = x;
//        String str = x1.toString();// 转化为字符串
//        if(x>2147483647 || (x==2147483647)){
//            return 0;
//        }
//        if (x<-2147483648 || (x==-2147483648)) {
//            return 0;
//        }
//            if(x>0){
//            int[] intArray = new int[str.length()];// 新建一个数组用来保存num每一位的数字
//            for (int i = 0; i < str.length(); i++) {
//                Character ch = str.charAt(i);
//                intArray[i] = Integer.parseInt(ch.toString());
//            }
//            int[] array1 = new int[str.length()];// 新建一个数组用来保存num每一位的数字
//            int k =0;
//            for (int j = intArray.length-1; j>=0; j--) {
//                    array1[k]=intArray[j];
//                    k++;
//            }
//            String str1 = "";
//            for(int z = 0;z<array1.length;z++){
//                String s = new String();
//                int sss = array1[z];
//                s=Integer.toString(sss);
//                str1 = str1.concat(s);
//            }
//             Long num1 = Long.parseLong(str1);
//            if(num1>2147483647 || (num1==2147483647)){
//                    return 0;
//            }
//            num = Integer.parseInt(str1);
//            return num;
//        }else{
//            int[] intArray = new int[str.length()-1];// 新建一个数组用来保存num每一位的数字
//            int kk = 0;
//            for (int i = 1; i < str.length(); i++) {
//                Character ch = str.charAt(i);
//                intArray[kk] = Integer.parseInt(ch.toString());
//                kk++;
//            }
//            String[] array1 = new String[str.length()];// 新建一个数组用来保存num每一位的数字
//            array1[0]= String.valueOf(str.charAt(0));
//            int k =1;
//            for (int j = intArray.length-1; j>=0; j--) {
//                array1[k]= String.valueOf(intArray[j]);
//                k++;
//            }
//            String str1 = "";
//            for(int z = 0;z<array1.length;z++){
//                str1 = str1.concat(array1[z]);
//            }
//                Long num1 = Long.parseLong(str1);
//                if (num1<-2147483648 || (num1==-2147483648)) {
//                    return 0;
//                }
//            num = Integer.parseInt(str1);
//        }
//        return num;
//    }

    public int reverse(int x) {
        int res = 0;
        while(x!=0) {
            //每次取末尾数字
            int tmp = x%10;
            //判断是否 大于 最大32位整数
            if (res>214748364 || (res==214748364 && tmp>7)) {
                return 0;
            }
            //判断是否 小于 最小32位整数
            if (res<-214748364 || (res==-214748364 && tmp<-8)) {
                return 0;
            }
            res = res*10 + tmp;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        reverse res = new reverse();
        int num = res.reverse(-123);
    }
}
