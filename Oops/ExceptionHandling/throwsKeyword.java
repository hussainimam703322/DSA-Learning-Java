package ExceptionHandling;

class A{
    public void show() throws ClassNotFoundException{
        try {
            Class.forName("DEMO");
        } catch (ClassNotFoundException e) {
            System.out.println("Not able to find the class" +e );
        }
    }
}
public class throwsKeyword {
    static{
        System.out.println("static loaded");
    }
    //it is not better to throws exceptions to main method for handling because 
    //main method is handle by JVM will say okay 🙃 i will handle so it simply stop the executions
    //public static void main(String[] args) throws ClassNotFoundException
    public static void main(String[] args){
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
/*
throws is a keyword in Java that is used in the signature of a method to indicate that
this method might throw one of the listed type exceptions. 
The caller to these methods has to handle the exception using a try-catch block. 
It can handle multiple exceptions along with the method signature
It is not handling the exceptions by itself rather it handling  the exceptions with functions

*/