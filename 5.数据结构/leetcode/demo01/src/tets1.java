package src;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tets1 {
    public static void main(String[] args) throws ParseException {
        String dateStr = "2023-06-25 08:00:20";
        String dateFormatStr = "yyyy-MM-dd HH:mm:ss";

        SimpleDateFormat dateFormat = new SimpleDateFormat(dateFormatStr);
        long time2 = dateFormat.parse(dateStr).getTime();
        System.out.println(time2);

                long timestamp =  1687651220821L;
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                String timestampWithMilliseconds = sdf.format(new Date(timestamp));
                System.out.println(timestampWithMilliseconds);
    }
}
