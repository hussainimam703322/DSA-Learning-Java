package DeepConcepts;
//we can only use abstract method inside abstract class
//but we can use abstract or non abstract method inside abstract class
//we cannot create object of abstract class
abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void music(){
        System.out.println("Music listening...");
    }
}
class Active extends Car{
    public void drive(){ //we cannot change the name of method which are declare as abstract method
        System.out.println("I am driving");
    }
    public void fly(){
        System.out.println("I am flying");
    }
}
class abstractkeyword {
     public static void main(String[] args) {
        Car obj = new Active(); //we can object of abstract class but we can make reference of abstract class
        obj.music();
        obj.drive();
        obj.fly();
     
     }
}
