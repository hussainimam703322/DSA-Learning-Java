public class ExceptionHandling {
    public static void main(String[] args) {
        int i=2;
        int j=0;

        int arr[] = new int[5];
        String str = null;
/*
➤output of exceptions depend on order in which statements are written inside try block
➤Only one exception will print in multi-catch and output depends on which statments are
 written first
*/
        try {
            System.out.println(str.length());
            j = 18/i;
            System.out.println(arr[5]);
            
        }
        catch(ArithmeticException e){
            System.out.println("cannot divivde by zero");
        }    
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array size exceeded");
        }
        catch(Exception e){ //" e "  show the type of exceptions occuring on try statments executions
           System.out.println("Something went wrong" + e);
        }
//Exception is the parent class of all types of exceptions may occur during runtime error
        System.out.println(j);
        System.out.println("hi Guys");

    }

}
