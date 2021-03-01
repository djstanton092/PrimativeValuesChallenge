package com.dstanton;

public class Main {

    public static void main(String[] args) {
    /*
        
    */


        byte byteValue = 127;       //maximum value for a byte
        short shortValue = 32767;   //maximum value for a short
        int intValue = 2147483547;  //maximum value for an int


        long longTotal = (long)(50000 + ((long) (10 * ((long)(byteValue) + (long)(shortValue) + (long)(intValue)))));

//correct sum = 2_147_516_441

        //long longTotal2 = (long)byteValue + (long)shortValue + (long)intValue;
        long longTotal2 = 50000L + 10L * ((long)byteValue + (long)shortValue + (long)intValue);

        /*long longTotal2 = 50000L + 10L * (byteValue + shortValue + intValue);*/

        System.out.println("byteValue = " + byteValue);
        System.out.println("shortValue = " + shortValue);
        System.out.println("intValue = " + intValue);


        System.out.println("longTotal  = " + longTotal);
        System.out.println("longTotal2 = " + longTotal2);


    }
}
