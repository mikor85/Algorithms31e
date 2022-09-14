package Algorithms.lessonSix.dynamicArray;

public interface Dynamic {
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
