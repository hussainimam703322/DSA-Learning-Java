package MultThreadingconcepts;
//➤ both method run simultaneously and output will be differ everytime when you run the code
public class MultiThreadings {
    static class A extends Thread{
        public void run(){
            for(int i=0;i<=10;i++){
                System.out.println("Imam");
                //➤ sleep method basically throws a interrupted exception ,so we use try and catch
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    static class B extends Thread{
        public void run(){
            for(int i=0;i<=10;i++){
                System.out.println("Hussain");
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {
        A t = new A();
        B t1 = new B();
        // ➤ System.out.println(t.getPriority());
        t1.setPriority(8);

//➤ using priority we can only suggest to scheduler to give more priority to that object but still thread will execute alternatively        
        // System.out.println(t.getPriority()); 
        t.start();
        t1.start();
        // for(int i=0;i<=10;i++){
        //     System.out.println("Ansari");
        // }

    }
}
/*
Multithreading.A t = multithreading.new A();
if we not make class A outer class we have to declare instance like above
 */