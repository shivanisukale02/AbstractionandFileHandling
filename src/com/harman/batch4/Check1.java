/**Excptonal handling nullpointer exception and arithmeticexcepion*/
package com.harman.batch4;

public class Check1 {
    public static void main(String[] args) {
        try {
            String name=null;
            System.out.println(name.length());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero is not possible");
        }
        catch (NullPointerException e){
            System.out.println("Null value is not accepted");
        }
    }
}
