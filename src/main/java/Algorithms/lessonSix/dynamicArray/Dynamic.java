package Algorithms.lessonSix.dynamicArray;

import java.util.Iterator;

public interface Dynamic extends Iterable<Integer> {
    Iterator<Integer> iterator();

    public void add(int data);

    public void addAt(int index, int data);

    public void remove(int data);

    public void removeAt(int index);

    public int size();

    public void shrinkSize();

    public void set(int index, int data);

    public int get(int index);

    public void clear();

    public boolean contains(int data);

    public boolean isEmpty();
}
