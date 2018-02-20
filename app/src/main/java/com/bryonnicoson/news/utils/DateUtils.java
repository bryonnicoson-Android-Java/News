package com.bryonnicoson.news.utils;

import com.google.firebase.crash.FirebaseCrash;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by bryon on 2/20/18.
 */

public class DateUtils {
    public static String formatNewsApiDate(String inputDate){
        try {
            String inputDateFormat = "yyy-MM-dd'T'HH:mm:ss'Z'";
            String outputDateFormat = "EEEE, d MMM yyyy KK:mm";

            SimpleDateFormat inputFormat = new SimpleDateFormat(inputDateFormat);
            SimpleDateFormat outputFormat = new SimpleDateFormat(outputDateFormat);

            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            FirebaseCrash.report(e);
        }
        return inputDate;
    }
}
