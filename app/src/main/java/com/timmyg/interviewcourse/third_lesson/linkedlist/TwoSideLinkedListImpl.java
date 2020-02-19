package com.timmyg.interviewcourse.third_lesson.linkedlist;

public class TwoSideLinkedListImpl<E> extends LinkedListImpl<E> implements TwoSideLinkedList<E> {

    protected Entry<E> lastElement;

    @Override
    public void insertLeft(E value) {
    super.insert(value);
    if (getSize() == 1){
        lastElement = first;
    }
    }

    @Override
    public void insertRight(E value) {
    Entry<E> newElement = new EntryImpl<>(value);
    if (size==0) {
        first = newElement;
    } else {
        lastElement.setNext(newElement);
    }
    lastElement = newElement;
    size++;
    }

    @Override
    public E removeLeft() {
        E removed = super.remove();
        if (size==0){
            lastElement = null;
        }
        return removed;
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
        } else if(current == lastElement) {
            lastElement = previous;
            previous.setNext(null);
        }

        else {
            previous.setNext(current.getNext());
        }
        size--;
        return true;

    }
}
