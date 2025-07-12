package lk.ijse.gdse71.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInterface{

    /* --------------------------------------------- PROPERTY INJECTION --------------------------------------*/
    /*@Autowired
    DI di;              //property injection

    public Test2() {
        System.out.println("Test2 Constructor Called");
    }

    public void test(){
        di.sayHello();
    }*/
    /* --------------------------------------------- PROPERTY INJECTION --------------------------------------*/





    /* --------------------------------------------- CONSTRUCTOR THROUGH INJECTION --------------------------------------*/

   /* @Autowired               constructor inject karaddi me annotation eka onima nehe
    DI di;

    public Test2(DI di) {
        this.di = di;
    }

    public void test() {
        di.sayHello();
    }*/
    /* --------------------------------------------- CONSTRUCTOR THROUGH INJECTION --------------------------------------*/





    /* --------------------------------------------- SETTER METHOD THROUGH INJECTION --------------------------------------*/

  /*  @Autowired               constructor inject karaddi me annotation eka onima nehe
    DI di;

   public void setterMethod(DI di) {
       this.di = di;
   }

    public void test() {
        di.sayHello();
    }*/

    /* --------------------------------------------- SETTER METHOD THROUGH INJECTION --------------------------------------*/





    /* --------------------------------------------- INTERFACE THROUGH INJECTION --------------------------------------*/

    @Autowired
    DI di;

    @Override
    public void injected(DI test2) {
        this.di = test2;
    }

    public void test(){
        di.sayHello();
    }


    /* --------------------------------------------- INTERFACE THROUGH INJECTION --------------------------------------*/
}
