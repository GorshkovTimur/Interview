package com.timmyg.interviewcourse.second_lesson.second_task;

import java.util.List;

public class PrintMonitorReport implements Output{
    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Output to monitor");
        for(ReportItem item : items){
            System.out.format("monitor %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
}

