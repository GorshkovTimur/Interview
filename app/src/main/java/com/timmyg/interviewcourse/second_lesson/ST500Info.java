package com.timmyg.interviewcourse.second_lesson;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDateTime;

public class ST500Info  {
    public SensorTemperature getData(){

        return new SensorTemperature(){
            public int identifier(){
                return 1;
            }
            public double temperature(){
                return 22.0;
            }
            @RequiresApi(api = Build.VERSION_CODES.O)
            public int year(){
                return LocalDateTime.now().getYear();
            }
            @RequiresApi(api = Build.VERSION_CODES.O)
            public int day(){
                return LocalDateTime.now().getDayOfYear();
            }
            @RequiresApi(api = Build.VERSION_CODES.O)
            public int second(){
                LocalDateTime now = LocalDateTime.now();
                return now.getHour()*3600 + now.getMinute()*60 + now.getSecond();
            }
        };
    }
}
