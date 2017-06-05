package com.company;

import java.io.BufferedReader;
import java.io.FileReader;



public class Main {

    public static void main(String[] args) {

        try {
            ParsingBrackets arcsArray = new ParsingBrackets();
            boolean isWrite = false;
            BufferedReader stream = new BufferedReader(new FileReader("TestCase.txt"));
            String data ;

            while ((data = stream.readLine()) != null){
                for (char symbol:data.toCharArray()) {

                    if(symbol == '{' || symbol == '(' || symbol == '<' || symbol == '[') {
                        arcsArray.push(symbol);
                    }
                    if(symbol == '}' || symbol == ')' || symbol == '>' || symbol == ']'){
                        isWrite = arcsArray.pop(symbol);
                    }
                }

                if (isWrite) {
                    isWrite = arcsArray.isElement();
                }
                System.out.println("\nString = "+data);
                System.out.println("Is string write = "+isWrite);
//                cleaning after reading string is not going, so brackets lives for next string
//                arcsArray.cleanArray();
                isWrite = false;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
