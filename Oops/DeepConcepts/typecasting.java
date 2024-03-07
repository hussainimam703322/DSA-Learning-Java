package DeepConcepts;
//here B know about the class A because it is subclass but A don't know about B
class A{
    public void show1(){
        System.out.println("A show");
    }
}
class B extends A{
    public void show2(){
        System.out.println("B show");
    }
}
public class typecasting {
    public static void main(String[] args) {
        //UPCASTING
        A obj = (A) new B(); //here we have created object of B AND upcasting to A
        obj.show1();
        
        //DOWNCASTING
        B obj1 = (B) obj; //obj is reference of A so we are downcasting to make it reference to B
        obj1.show2();           
    }
}
/*
TypeCasting helps to call two different method lies in different class by creating one object of a  class and creating reference    

UPCASTING .....
1.creating object of B but giving reference to A it means we are acknowleding A from subclass B()
so use (A) to go up from subclass B to A

DOWNCASTING.....
In this we are making instance of B by refering to obj1 and make it equal to obj which refers to another instance A
so we use (B) to downcast from A to B
*/  