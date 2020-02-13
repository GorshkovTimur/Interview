package com.timmyg.interviewcourse.data;

public class Converter {

    private float source;
    private float result;

    public Converter(float source) {
        this.source = source;
    }

    public float convert(ConvertTo convert){
        result = convert.Do(source);
        return result;
    }


}
