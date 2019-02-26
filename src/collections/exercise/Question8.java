package collections.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

//8.Write a program to format date as example "21-March-2016"
public class Question8 {
    public static void main(String[] args) {

        String pattern = "dd-MMMM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

    }
}
