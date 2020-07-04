package com.example.unit_testing_example;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;

public class UtilsTest {

    @Test
    public void check_Email_IsValid() {
        String testEmail = "eprinceotis@gmail.com";
        boolean isEmailValid = Utils.checkEmailForValidity(testEmail);

        Assert.assertThat(String.format("Email Validity Test failed for %s ", testEmail), isEmailValid, is(true));
    }

    @Test
    public void check_If_IsConverted_Correctly() {
        long inMillis = System.currentTimeMillis();
        Date date = Utils.calendarDate(inMillis);

        assertEquals("Date time in millis is wrong", inMillis * 1000, date.getTime());
    }
}
