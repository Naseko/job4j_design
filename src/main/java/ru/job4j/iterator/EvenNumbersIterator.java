package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class EvenNumbersIterator implements Iterator<Integer> {

    private int[] data;
    private int index;

    public EvenNumbersIterator(int[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return index < data.length && hasEvenElems();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return nextEven(index++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer<? super Integer> action) {
        throw new UnsupportedOperationException();
    }

    private boolean hasEvenElems() {
        for (int j = index; j < data.length; j++) {
            if (isEven(data[j])) {
                return true;
            }
        }
        return false;
    }

    private Integer nextEven(int ix) {
        for (int j = ix; j < data.length; j++) {
            if (isEven(data[j])) {
                index = j + 1;
                return data[j];
            }
        }
        throw new NoSuchElementException();
    }

    private boolean isEven(int num) {
        return (num % 2) == 0;
    }
}