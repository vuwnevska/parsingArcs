package com.company;

/**
 * Created by inspirion on 05.06.17.
 */
public class SpecialStack <T> extends StackArray <T>{

    SpecialStack(){
        <Character> super();
    }

    public <T> boolean pop(char brackets) {

        if(size == 0)
            return false;


        switch (brackets) {
//             need to work with array as a char array
            case '}': {
                if (element[--size] == (Character)'{') // cannot cast T to char
                    return true;
                return false;
            }
            case ')': {
                if (element[--size] == (Character)'(') // cannot cast char to T
                    return true;
                return false;
            }

            case ']': {
                if (element[--size] == (Character)'[')
                    return true;
                return false;
            }
            case '>': {
                if (element[--size] == (Character)'<')
                    return true;
                return false;
            }
            default: {
                return false;
            }
        }
    }


}
