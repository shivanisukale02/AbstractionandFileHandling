/**Finally* :whatever error in above of finally it doesnt care it just run whatever inside it*/
package com.harman.batch4;

public class Check3 {
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
        finally {
            System.out.println("Welcome to harman company");
        }
    }
}
