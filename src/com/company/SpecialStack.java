package com.company;

/**
 * Created by inspirion on 05.06.17.
 */
public class SpecialStack <T> extends StackArray <T>{

    public <T> boolean pop(char brackets) {

        if(size == 0)
            return false;


        switch (brackets) {
//             need to work with array as a char array
            case '}': {
                if ((char)element[--size] == '{') // cannot cast T to char
                    return true;
                return false;
            }
            case ')': {
                if (element[--size] == (T)'(') // cannot cast char to T
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


}
