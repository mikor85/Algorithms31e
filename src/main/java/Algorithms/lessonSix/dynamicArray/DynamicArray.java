package Algorithms.lessonSix.dynamicArray;

import java.util.Arrays;

public class DynamicArray implements Dynamic {

    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    @Override
    public void add(int data) {
        if (count == size) {
            // увеличить массив в два раза и скопировать в него старые элементы
            growSize();
        }
        array[count] = data;
        count++;
    }

    @Override
    public void addAt(int index, int data) {
        if (count == size) {
            // увеличить массив в два раза и скопировать в него старые элементы
            growSize();
        }
        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = data;
        count++;
    }

    @Override
    public void remove(int data) {
        if (contains(data)) {
            for (int i = 0; i < count; i++) {
                if (array[i] == data) {
                    removeAt(i);
                }
            }
        } else {
            System.out.println("В массиве нет элемента с указанным значением " + data);
        }
    }

    @Override
    public void removeAt(int index) {
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }
        int[] temp = new int[count - 1];
        for (int i = 0; i < index; i++) {
            temp[i] = array[i];
        }
        for (int i = index; i < count - 1; i++) {
            temp[i] = array[i + 1];
        }
        array = temp;
        count--;
        size = temp.length;
    }

    private void growSize() {
        int[] temp = new int[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = temp.length;
    }

    @Override
    public int size() {
        return count;
    }

    public int getInnerArrayLength() {
        return size;
    }

    @Override
    public void shrinkSize() {
        int[] temp = new int[count];
        for (int i = 0; i < count; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = temp.length;
    }

    @Override
    public void set(int index, int data) {
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }
        array[index] = data;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void clear() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    @Override
    public boolean contains(int data) {
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return "DynamicArray = " + Arrays.toString(array) +
                ", count = " + count +
                ", size = " + size;
    }

    public String print() {
        StringBuilder arrayAsString = new StringBuilder();
        arrayAsString.append("[");
        for (int i = 0; i < count; i++) {
            arrayAsString.append(array[i]);
            if (i != count - 1) {
                arrayAsString.append(", ");
            }
        }
        arrayAsString.append("]");
        return arrayAsString.toString();
    }
}