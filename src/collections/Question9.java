package collections;

//9.Write a program to display times in different country format.

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Question9 {

    public static void main(String[] args) throws Exception {
        Date d1 = new Date();
        System.out.println("today is " + d1.toString());

        Locale locEnglish = new Locale("en", "US");
        DateFormat df1 = DateFormat.getDateTimeInstance(DateFormat.FULL, 3, locEnglish);
        System.out.println("today is in English Language : " + df1.format(d1));

        Locale locItalian = new Locale("it", "ch");
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locItalian);
        System.out.println("today is in Italian Language : " + df2.format(d1));

        Locale locFrench = new Locale("fr", "FR");
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, locFrench);
        System.out.println("today is in French Language : " + df3.format(d1));

        Locale locGerman = new Locale("de", "DE");
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, locGerman);
        System.out.println("today is in German Language : " + df4.format(d1));

        Locale locHindi = new Locale("hi", "IN");
        DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.FULL, 3, locHindi);
        System.out.println("today is in Hindi Language : " + df5.format(d1));
    }
}
