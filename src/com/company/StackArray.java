package com.company;

/**
 * Created by inspirion on 30.05.17.
 */
public class StackArray <T>{

    protected T[] element  = (T[]) new Object [0];
    protected   int size;



    public void push(T value)
    {
        capasity(size+1);
        element[size++] = value;
    }

    public void capasity(int newCapasity)
    {
        if (element.length >= newCapasity){
            return;
        }
        T[] newElements = (T[]) new Object [newCapasity*2];
        for(int i=0; i<size; i++){
            newElements[i]=element[i];
        }
        element = newElements;
    }
    public T pop()
    {
        if(size==0)
            return null;

        return element[--size];

    }

    public T peek()
    {
        return element[size-1];
    }

    public void printStackState(){
        for(int i=0; i<size; i++){
            System.out.println(element[i]);
        }
    }
    public boolean isElement(){
        if (size > 0)
            return false;
        return true;
    }

}
