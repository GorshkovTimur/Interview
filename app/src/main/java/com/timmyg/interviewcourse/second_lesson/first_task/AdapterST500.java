package com.timmyg.interviewcourse.second_lesson.first_task;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.time.LocalDateTime;

public class AdapterST500 implements MeteoSensor {

    private SensorTemperature st500;

    public AdapterST500(SensorTemperature st500) {
        this.st500 = st500;
    }

    @Override
    public int getId() {
        return st500.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)(st500.temperature());
    }

    @Override
    public Float getHumidity() {
        return 0.f;
    }

    @Override
    public Float getPressure() {
        return 0.f;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}
