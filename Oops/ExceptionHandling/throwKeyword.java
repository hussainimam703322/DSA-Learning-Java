package ExceptionHandling;

public class throwKeyword {
    public static void main(String[] args) {
        int i=20;
        int j=0;
/*
in this , 'throw' allows to throw a exceptions as object from try to catch(accept object )
 */
        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("j cannot divide by i");
            }
        }
        catch(ArithmeticException e){
            j = 18/1;
            System.out.println("that the default output" + e);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("Imam");
    }
}
/*
The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
We can throw either checked or unchecked exception.
The throw keyword is mainly used to throw custom exceptions.
It is written inside the method using new keyword
It can only handle one exceptions only.
 */