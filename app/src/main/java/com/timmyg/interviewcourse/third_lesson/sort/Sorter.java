package com.timmyg.interviewcourse.third_lesson.sort;

public class Sorter {
   public static void sortByInsert(int[] array){
        int in,out;

        for (out=1; out<array.length; out++){
            int tmp = array[out];
            in = out;
            while (in >0 && array[in-1] >= tmp){
                array[in] = array[in-1];
                in--;
            }
            array[in] = tmp;
        }
    }
}
