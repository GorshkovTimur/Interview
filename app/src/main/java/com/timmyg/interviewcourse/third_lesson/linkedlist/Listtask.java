package com.timmyg.interviewcourse.third_lesson.linkedlist;

public class Listtask {
    public static void main(String[] args) {
        TwoSideLinkedList<Integer> list = new TwoSideLinkedListImpl<>();
        list.insertRight(2);
        list.insertRight(3);
        list.insertLeft(4);
        System.out.println(list.removeLeft().toString());
        System.out.println(list.removeLeft().toString());
        System.out.println(list.removeLeft().toString());
    }
}
