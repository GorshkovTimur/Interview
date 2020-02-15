package com.timmyg.interviewcourse.second_lesson.first_task;

public interface SensorTemperature {
    int identifier(); // идентификатор датчика
    double temperature(); // температура датчика
    int year();          // Год
    int day();           // День года
    int second();        // Секунда дня
}
