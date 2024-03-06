package Polymorphism;
//method dispatch will only work when there is inheritance
public class MethodDispatch {
    public void show(){
        System.out.println("A show");
    }
}
class B extends MethodDispatch{
    public void show(){
        System.out.println("B show");
    }
}
class C extends MethodDispatch{
    public void show(){
        System.out.println("C show");
    }
}
class Main{
    public static void main(String[] args) {
        MethodDispatch obj = new MethodDispatch();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
