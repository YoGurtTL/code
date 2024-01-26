package src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class myAtoi {
    public int myAtoi(String s) {
        Automaton automaton = new Automaton();
        int length = s.length();
        for (int i =0 ; i <length; ++i){
            automaton.get(s.charAt(i));
        }
        return (int)(automaton.sign* automaton.ans);
    }

    public static void main(String[] args) {
//        myAtoi myAtoi = new myAtoi();
//        myAtoi.myAtoi("   -42");
        Automaton a =  new Automaton();
        a.ss();
    }
}

class Automaton{
    public  int sign = 1;
    public long ans = 0;
    private String state = "start";
    private Map<String,String[]> table = new HashMap<String,String[]>(){{
        put("start",new String[]{"start","signed","in_number","end"});
        put("signed",new String[]{"end","end","in_number","end"});
        put("in_number",new String[]{"end","end","in_number","end"});
        put("end",new String[]{"end","end","end","end"});
    }};

    public void ss(){
        Iterator<Map.Entry<String, String[]>> iterator = table.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String[]> entry = iterator.next();
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }
    }

    public void get(char c){
        state = table.get(state)[get_col(c)];
        if ("in_number".equals(state)){
            ans = ans *10 + c - '0';
            ans = sign == 1? Math.min(ans,(long) Integer.MAX_VALUE) : Math.min(ans,-(long) Integer.MIN_VALUE);
        }else if("signed".equals(state)){
            sign = c == '+' ? 1:-1;
        }
    }

    private int get_col(char c){
        if (c == ' ') {
            return 0;
        }
        if (c=='+' || c=='-'){
            return 1;
        }
        if(Character.isDigit(c)){
            return 2;
        }
        return 3;
    }
}
