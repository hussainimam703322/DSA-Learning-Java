package DeepConcepts;

public class innerclass {
    static class A{
    
        public void show(){
            System.out.println("imam");
        }
        class B{
            public void config(){
                System.out.println("hussain");
            }
        }
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();
    }
}

