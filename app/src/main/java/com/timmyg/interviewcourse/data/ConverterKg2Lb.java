package com.timmyg.interviewcourse.data;

public class ConverterKg2Lb implements ConvertTo {
    @Override
    public float Do(float source) {
        return source*2.2f;
    }
}
