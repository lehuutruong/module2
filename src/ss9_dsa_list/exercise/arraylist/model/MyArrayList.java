package ss9_dsa_list.exercise.arraylist.model;

import java.util.Arrays;

public class MyArrayList<E> {
       private int size = 0;
    private static final int DEFAULt_CAPACITY = 10;
    public Object[] elements;

    public MyArrayList() {
        elements = new Object[DEFAULt_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public boolean add(E element) {
        if(elements.length==size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }
    public   void add(E elment,int index){
        if(index>=elements.length){
            throw new IllegalArgumentException("index:"+index);
        }
        else if(elements.length==size){
            this.ensureCapacity(5);
        }
        if(elements[index]==null){
            elements[index]=elment;
            size++;
        }
        else {
            for (int i = size+1; i >=index ; i--) {
                elements[i]=elements[i-1];
            }
            elements[index]=elment;
            size++;
        }
    }
    public void ensureCapacity(int minCapacity){
        if(minCapacity>=0){
            int newSize=this.elements.length+minCapacity;
            elements= Arrays.copyOf(elements,newSize);
        }
        else {
            throw new IllegalArgumentException("minCapacity: "+minCapacity);
        }
    }
}
