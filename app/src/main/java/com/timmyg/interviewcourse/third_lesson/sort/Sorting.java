package com.timmyg.interviewcourse.third_lesson.sort;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,5,3,7,0,15};
        Sorter.sortByInsert(arr);
        System.out.println(Arrays.toString(arr));
    }
}
