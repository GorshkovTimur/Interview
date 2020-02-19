package com.timmyg.interviewcourse.third_lesson.fibbonaci;

import java.util.ArrayList;
import java.util.List;

public class Fibbonaci {

    private int endValue;
    private List<Integer> fiboArr;

    public Fibbonaci(int endValue) {
        this.endValue = endValue;
        fiboArr = new ArrayList<>();
    }

    public void getFibboNumbers(){
        fiboArr.add(1);
        fiboArr.add(2);
        for (int i=2; i < endValue; i++){
            int tmp = i;
            fiboArr.add(fiboArr.get(--tmp) + fiboArr.get(--tmp));
        }
        System.out.println(fiboArr.toString());
    }
}
