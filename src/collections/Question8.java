package collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Question8 {
    public static void main(String[] args) {

        String pattern = "dd-MMMM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

    }
}
