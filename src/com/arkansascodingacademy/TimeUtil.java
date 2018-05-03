package com.arkansascodingacademy;

import java.time.LocalTime;

@SuppressWarnings("WeakerAccess")
public class TimeUtil
{
    //Return true if it is after 12PM and before 4PM
    public static boolean isAfternoon(LocalTime time)
    {

        if(time.isAfter(LocalTime.of(12,00)) && time.isBefore(LocalTime.of(16,0)))
        {
            return true;
        }

       else return false;
    }

    //Return true if it is after midnight and before 4AM
    public static boolean isAfterMidnight(LocalTime time)
    {
        if(time.isAfter(LocalTime.of(0,00)) && time.isBefore(LocalTime.of(4,0)))
        {
            return true;
        }
        else return false;
    }
}
