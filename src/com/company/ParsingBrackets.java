package com.company;

/**
 * Created by inspirion on 01.06.17.
 */
public class ParsingBrackets {

    private char[] element  = new char[0];
    private int size = 0;

    public void capacity (int val){
        if (element.length > val)
            return;

        char [] elementArr = new char[val*2];
        for (int i=0; i < element.length; ++i){
            elementArr [i] = element [i];
        }
        element = elementArr;
    }

    public void push (char sum){
        capacity(size+1);
        element[size++] =  sum;

    }

    public boolean pop(char brackets) {

        if(size == 0)
            return false;

        switch (brackets) {

            case '}': {
                if (element[--size] == '{')
                    return true;
                return false;
            }
            case ')': {
                if (element[--size] == '(')
                    return true;
                return false;
            }

            case ']': {
                if (element[--size] == '[')
                    return true;
                return false;
            }
            case '>': {
                if (element[--size] == '<')
                    return true;
                return false;
            }
            default: {
                    return false;
            }
        }
    }


    public void printStackState (){

        for (char some:element) {
            System.out.print(some);
        }
        System.out.println();
    }

    public boolean isElement(){
        if (size > 0)
            return false;
        return true;
    }
    public void cleanArray(){
        if (size == 0)
            return;

        for (int i =0; i < element.length; ++i){
            element[i] = 0;
        }
        size = 0;
    }
}
