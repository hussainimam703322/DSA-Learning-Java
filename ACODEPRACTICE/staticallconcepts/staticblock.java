package staticallconcepts;
//aLL ABOUT STATIC BLOCK
class staticblock {
    static class Mobile{ //this makes it outer class if we remove static then it will become inner class of staticblock
        static String name;
        int price;
        String brand;

        static // we cannot declare static block in inner class
        {
            //it will only call once irrespective how many object created
           name = "phone";
           System.out.println("static block executed first and called first with classloader file");
        }

        Mobile(){ //constructor is used to intialise the object 
            price = 200;
            brand = "";
            System.out.println("constructor is called");
        }
        public void show(){ //this is non static method but we can use static variable,it will not harm
            System.out.println(name + " : " + brand + " : " + price);
        }
    }
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.name = "samsung";
        obj1.price = 2000;
        obj1.brand = "apple";
        Mobile obj2 = new Mobile();
        Mobile obj3 = new Mobile();
        
    }
}
