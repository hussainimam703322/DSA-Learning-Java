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
        
    }
}

