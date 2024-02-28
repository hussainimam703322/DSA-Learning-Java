package MultThreadingconcepts;

public class LamdaExpressions {
    public static void main(String[] args) {
        // Runnable obj1 = new Runnable() {       <-- we can also use this
            
        // };
        Runnable obj1 = () -> {
            for(int i=0;i<=5;i++){
                System.out.println("Imam");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                
            }
        };

        Runnable obj2 = () -> {
            for(int i=0;i<=5;i++){
                System.out.println("Hussain");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t = new Thread(obj1);
        Thread t1 = new Thread(obj2);

        t.start();
        t1.start();
    }
    
}
