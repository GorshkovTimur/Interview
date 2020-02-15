package com.timmyg.interviewcourse.second_lesson.first_task;

public class MeteoStation {
    public static void main(String[] args){
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        ST500Info st500Info = new ST500Info();
        meteoDb.save(ms200_1);
        meteoDb.save(new AdapterST500(st500Info.getData()));
    }
}
