package com.arkansascodingacademy;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class DateTimeUtilTest
{

    @Test
    void isHappyHour()
    {
        LocalDateTime fridayNotHappyHour = LocalDateTime.of(2018,5,4,8,0);
        LocalDateTime fridayHappyHour = LocalDateTime.of(2018,5,4,17,0);
        LocalDateTime thursdayHappyHour = LocalDateTime.of(2018,5,3,17,0);
        LocalDateTime thursdayNotHappyHour = LocalDateTime.of(2018,5,3,12,0);
        LocalDateTime saturday = LocalDateTime.of(2018,5,5,17,0);
        assertFalse(DateTimeUtil.isHappyHour(fridayNotHappyHour));
        assertTrue(DateTimeUtil.isHappyHour(fridayHappyHour));
        assertFalse(DateTimeUtil.isHappyHour(thursdayNotHappyHour));
        assertFalse(DateTimeUtil.isHappyHour(saturday));
        assertTrue(DateTimeUtil.isHappyHour(thursdayHappyHour));




    }
}