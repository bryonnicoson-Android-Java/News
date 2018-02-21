package com.bryonnicoson.news.utils;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by bryon on 2/20/18.
 */

public class DateUtilsTest {
    String correctInputDate1 = "2018-02-20T09:56:27Z";
    String correctOutputDate1 = "Tue, 20 Feb 2018 09:56";

    @Test
    public void formatNewsApiDate_correctDate_outputsCorrectDate() {
        String outputDate = DateUtils.formatNewsApiDate(correctInputDate1);
        assertEquals(outputDate, correctOutputDate1);
    }

    @Test
    public void formatNewsApiDate_nullInput_outputsNull() {
        String outputDate = DateUtils.formatNewsApiDate(null);
        assertEquals(outputDate, null);
    }
}
