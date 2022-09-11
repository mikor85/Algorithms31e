package Algorithms.lessonSix.dynamicArray;

public class DynamicArray {

    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    public void add(int i) {
        if (count == size) {
            // увеличить массив в два раза и скопировать в него старые элементы
            growSize();
        }
        array[count] = i;
        count++;
    }

    public void add(int index, int data) {
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

    private void growSize() {
        int[] temp = new int[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = temp.length;
    }

    public int size() {
        return count;
    }

    public int getInnerArrayLength() {
        return size;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "array=" + print() +
                ", count=" + count +
                ", size=" + size +
                '}';
    }

    public String print() {
        StringBuilder arrayAsString = new StringBuilder();
        arrayAsString.append("[");
        for (int i = 0; i < count; i++) {
            arrayAsString.append(array[i]);
            if (i != count - 1){
                arrayAsString.append(", ");
            }
        }
        arrayAsString.append("]");
        return arrayAsString.toString();
    }
}