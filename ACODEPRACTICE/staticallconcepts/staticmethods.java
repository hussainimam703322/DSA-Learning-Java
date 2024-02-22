package staticallconcepts;

public class staticmethods {
    static class Mobile{
        static String name;
        String brand;
        int price;

        public void show(){ //instance method
            System.out.println(name + ":" + brand + " : "+ price + " :");
        }

        public static void show1(Mobile obj){
            System.out.println("non static variables are not allowed in static method");
            System.out.println("if we want to use we need to pass reference of another object in static method as parameter");
            System.out.println(name + ":" + obj.brand + " : "+ obj.price + " :");
        }
    }
    /*
    *****IMPORTANT
    main-starting point of execution.
    static- helps to execute the code without creating class object
    as main is starting point of executions then how jvm will create object of class if it is starting point
    so we need to add STATIC KEYWORD to execute code  without creating the objects.
     */
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.name = "s21fe";
        obj1.brand = "samsung";
        obj1.price = 35000;

        Mobile obj2 = new Mobile();
        obj2.name = "15pro";
        obj2.brand = "Apple";
        obj2.price = 55000;

        //below both are calling object with different value assigned in both object
        obj1.show();
        obj2.show(); 

        Mobile.show1(obj2);




    }
}

