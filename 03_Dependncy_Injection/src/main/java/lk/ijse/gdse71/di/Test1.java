package lk.ijse.gdse71.di;

import org.springframework.core.convert.Property;
import org.springframework.stereotype.Component;

@Component
public class Test1 implements DI{
   /* --------------------------------------------- PROPERTY INJECTION --------------------------------------*/
    /*@Override
    public void sayHello() {
        System.out.println("Test 1 sayHello - Property injection");
    }

    public Test1() {
        System.out.println("Test 1 Constructor called - Property injection");
    }*/

    /* --------------------------------------------- PROPERTY INJECTION --------------------------------------*/



    /* --------------------------------------------- CONSTRUCTOR THROUGH INJECTION --------------------------------------*/
   /* @Override
    public void sayHello() {
        System.out.println("Test 1 sayHello - Constructor through injection");
    }

    public Test1() {
        System.out.println("Test 1 Constructor called - constructor injection");
    }*/

    /* --------------------------------------------- CONSTRUCTOR THROUGH INJECTION --------------------------------------*/




    /* --------------------------------------------- SETTER METHOD THROUGH INJECTION --------------------------------------*/
   /* @Override
    public void sayHello() {
        System.out.println("Test 1 sayHello - setter method through injection");
    }

    public Test1() {
        System.out.println("Test 1 Constructor called - setter method injection");
    }
*/
    /* --------------------------------------------- SETTER METHOD THROUGH INJECTION --------------------------------------*/





    /* --------------------------------------------- INTERFACE THROUGH INJECTION --------------------------------------*/
    @Override
    public void sayHello() {
        System.out.println("Test 1 sayHello - interface through injection");
    }

    public Test1() {
        System.out.println("Test 1 Constructor called - interface injection");
    }

    /* --------------------------------------------- INTERFACE THROUGH INJECTION --------------------------------------*/
}
