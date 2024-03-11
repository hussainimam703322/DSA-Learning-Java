package DeepConcepts.Interface;

/*
NOTE:- we must write all the methods written inside interface in all subclass 
 */
interface InterfaceAnimal{
    void walk();
    void run();
}
class Horse implements InterfaceAnimal{
    public void walk(){
       System.out.println("horse has 4 legs");
    }
    public void run(){
        System.out.println("run very fast");
    }
}
class Bird implements InterfaceAnimal{
    public void walk(){
        System.out.println("bird has 2 legs");
     }

    public void run(){
         System.out.println("birds can fly");   
    }
}
class Demo{
    public static void main(String[] args) {
        Horse obj = new Horse();
        Bird obj1 = new Bird();
        obj.walk();
        obj.run();
        obj1.walk();
        obj1.run();
    }
}
