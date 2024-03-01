package ExceptionHandling;
//we can also create our own exceptions like this
class ImamExceptions extends RuntimeException{
    public ImamExceptions(String message){
        super(message);
    }
}
class CustomExceptions {

    public static void main(String[] args) {
        int i = 20;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ImamExceptions("j cannot divide by i");
            }
        } 
        catch (ImamExceptions e) {
            j = 18 / 1;
            System.out.println("that the default output" + e);   
        } 
        catch (Exception e) {
            System.out.println("Something went wrong");
        }

        System.out.println(j);
        System.out.println("Imam");
    }
}
