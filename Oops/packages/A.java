package packages;

public class A {
    public int marks =6;
    public void show(){
        System.out.println("A is ouput");
    }
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.marks);
        obj.show();
    }
}
/*
    1.PACKAGE helps to bind the multiple classes and interfaces in single unit.
    2.We can easly call one class in another and execute it and we simply get ouput in another class within the package and outside the package when declared as public.
    3.Method can also be call in another package when declared public and variable can also
      be call in another package  when it declare as public in anothe package
     */