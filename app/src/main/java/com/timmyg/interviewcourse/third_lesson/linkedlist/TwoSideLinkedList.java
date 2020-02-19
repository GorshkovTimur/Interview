package com.timmyg.interviewcourse.third_lesson.linkedlist;

public interface TwoSideLinkedList<E> extends LinkedList<E> {

    void insertLeft(E value);
    void insertRight(E value);

    E removeLeft();
}
