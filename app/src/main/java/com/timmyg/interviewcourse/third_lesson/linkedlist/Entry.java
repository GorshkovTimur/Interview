package com.timmyg.interviewcourse.third_lesson.linkedlist;

public interface Entry<T> {

    T getValue();

    Entry<T> getNext();

    void setNext(Entry<T> nextElement);


}
