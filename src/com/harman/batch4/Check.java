/**exception handling simple exception*/
package com.harman.batch4;

public class Check {
    public static void main(String[] args) {
        try {
            int x = 10, y = 0, z;
            z = x / y;
            System.out.println(z);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
