package MethodOverriding;
import java.util.*;
class MethodOverriding1 {   
     
    public void show(){
        System.out.println("A show");
    }

    public void config(){
        System.out.println("A config");
    }
}

class B extends MethodOverriding1{
    
    public void show(){
        System.out.println("B show");
    }
}

class Main{
    public static void main(String[] a) {
        MethodOverriding1 obj = new B();
        obj.show();

    /*
    1.PACKAGE helps to bind the multiple classes and interfaces in single unit.
    2.We can easly call one class in another and execute it and we simply get ouput in another class
     */
        // AdvanceCal obj = new Cal();
        // int result = obj.add(3, 4);
        // System.out.println(result);
        
    }
}

