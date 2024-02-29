package MultThreadingconcepts;

public class RunnableInterface {
    //➤ here A is static nested class
    static class A implements Runnable{
        public void run(){
            for(int i=0;i<=5;i++){
                System.out.println("Imam");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    static class B implements Runnable{
        public void run(){
            for(int i=0;i<=5;i++){
                System.out.println("Hussain");
            }
        }
    }
    public static void main(String[] args) {
        //➤ As A make instance of it as Runnable ,so we can also here because thread has multiple construcor
        Runnable obj = new A();
        B obj1 = new B();
        Thread t = new Thread(obj); //➤ we are declaring instance of thread to get start method
        Thread t1 = new Thread(obj1);

        t.start();
        t1.start();
    }
}
