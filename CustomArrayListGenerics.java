package Generics;

import java.util.Arrays;

public class CustomArrayListGenerics<T> {
    
    private int size;
    final private static int DEFAULT_SIZE = 10;
    Object data[] = new Object[DEFAULT_SIZE];

    public int size(){
        return size;
    }

    public void add(T element){
        if(isFull()){
            resize();
        }

        data[size++] = element;
    }

    public T get(int index){

        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }

        @SuppressWarnings("unchecked")
        T element = (T)data[index];
        return element;
    }

    public void set(T element, int index){
        if(index < 0 || index >= size){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for size " + size);
        }

        data[index] = element;
    }

    public T remove(){

        if(data.length < 0){
            throw new ArrayIndexOutOfBoundsException("Index "+"out of bounds for size " + size);
        }

        @SuppressWarnings("unchecked")
        T element = (T)data[--size];
        
        return element;
    }

    private boolean isFull(){
        return data.length == size;
    }

    private void resize(){
        Object temp[] = new Object[2 * data.length];
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    @Override
    public String toString(){
        Object newObj[] = Arrays.copyOfRange(data, 0, size);
        return Arrays.toString(newObj);
    }
}
