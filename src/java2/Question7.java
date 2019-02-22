package java2;

import java.text.DecimalFormat;

// 7. WAP to convert seconds into days, hours, minutes and seconds.
public class Question7 {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("##.00");
        float seconds = 432030;
        float minutes = seconds / 60;
        float hours = minutes / 60;
        float days = hours / 24;
        System.out.println("seconds " + f.format(seconds) + " minutes " + f.format(minutes) + " hours " + f.format(hours) + " days " + f.format(days));
    }
}
