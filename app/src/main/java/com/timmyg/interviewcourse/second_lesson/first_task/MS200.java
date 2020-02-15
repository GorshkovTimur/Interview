package com.timmyg.interviewcourse.second_lesson.first_task;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.timmyg.interviewcourse.second_lesson.first_task.MeteoSensor;

import java.time.*;

public class MS200 implements MeteoSensor {
    int id;

    public MS200(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public Float getTemperature(){
        return (float)20;
    }
    public Float getHumidity(){
        return (float)60;
    }
    public Float getPressure(){
        return (float)752.4;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public LocalDateTime getDateTime(){
        return  LocalDateTime.now();
    }
}
