package algorithms.warmup;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Time_Conversion {
    static String timeConversion(String s) {
        String[] date = s.split(":");
        String hour = date[0];
        String min = date[1];
        String sec = date[2].substring(0, 2);
        String ampm = date[2].substring(2, 4);
        String time = "";

        if (ampm.equals("AM")) {
            ampm.replaceAll("AM", "");
            if (hour.equals("12")) {
                hour = "00";
            }
            time = hour + ":" + min + ":" + sec;
        } else {
            ampm.replaceAll("PM", "");
            if (hour.equals("12"))
                hour = "00";
            int h = Integer.parseInt(hour) + 12;
            time = h + ":" + min + ":" + sec;

        }
        return time;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
