package DeepConcepts.Interface;
/*
class --> class = extends
class --> interface = implements
class --> abstract = extends
interface -- > interface =extends

 */

interface A{
    int age = 23; //we can also use variables inside interface but it will be final and static by default
    String name="Imam";
    void walk();
    void run();
}
interface X{
  void  fly();
}
interface Y extends X{
 //we can also inherit the one interface from another and implement it in class B along with superclass A   
}

//basically one class can impelement multiple interface but we cannot do in abstract class
class B implements A,Y{
    public void walk(){
         System.out.println("I can walk");
    }
    public void run(){
       System.out.println("I can run");
    }
    public void fly(){
        System.out.println("I can fly");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.fly();
        obj.walk();
        obj.run();
    }
}
