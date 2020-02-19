package com.timmyg.interviewcourse.third_lesson.linkedlist;

public class LinkedListImpl<E> implements LinkedList<E> {

    protected Entry<E> first;
    protected int size;


    @Override
    public void insert(E value) {
    Entry<E> newElement = new EntryImpl<>(value);
    newElement.setNext(first);
    first = newElement;
    size++;
    }

    @Override
    public E remove() {
        if (size==0){
            return null;
        }

        Entry<E> removedElement = this.first;
        this.first = first.getNext();
        size--;
        return removedElement.getValue();
    }

    @Override
    public boolean remove(E value) {
        Entry<E> current = first;
        Entry<E> previous = null;
        while (current != null) {
            if (current.getValue().equals(value)) {
                break;
            }
            previous = current;
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        if (current == first){
            first=first.getNext();
        } else {
            previous.setNext(current.getNext());
        }

        size--;
        return true;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean find(E value) {
        return doFind(value) != null;
    }

    @Override
    public E getFirstElement() {
        return first.getValue();
    }

    private Entry<E> doFind(E value){
        Entry<E> current = first;

        while (current != null) {
            if (current.getValue().equals(value)) {
                return current;
            }
                current = current.getNext();
        }
        return null;
    }
}
