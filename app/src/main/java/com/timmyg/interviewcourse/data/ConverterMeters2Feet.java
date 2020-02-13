package com.timmyg.interviewcourse.data;

public class ConverterMeters2Feet implements ConvertTo {

    @Override
    public float Do(float source) {
        return source*3.28f;
    }
}
