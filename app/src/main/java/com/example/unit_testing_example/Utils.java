package com.example.unit_testing_example;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils {
    public static final int MILLIS = 1000;
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean checkEmailForValidity(String email) {
        email = email.trim();
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);

        return matcher.find();
    }

    public static Date calendarDate(long epocSeconds) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.setTimeInMillis(epocSeconds * MILLIS);

        return calendar.getTime();
    }
}
