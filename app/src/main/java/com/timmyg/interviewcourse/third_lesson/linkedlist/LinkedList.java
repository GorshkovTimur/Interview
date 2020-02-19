package com.timmyg.interviewcourse.third_lesson.linkedlist;

public interface LinkedList<E> {

    void insert(E value);

    E remove();

    boolean remove(E value);

    int getSize();

    boolean find (E value);

    E getFirstElement();
}
