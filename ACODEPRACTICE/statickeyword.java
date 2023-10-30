public class statickeyword {
    static class solution{
        String brand;
        String name;
        int price;

        public void show(){
            System.out.println(brand+" " + name+" " + price+" ");
        }
    }
   public static void main(String[] args) {
       solution obj1 = new solution();
       obj1.brand = "samsung";
       obj1.name = "galaxy";
       obj1.price = 5000;
      
       solution obj2 = new solution();
       obj2.brand = "Apple";
       obj2.name = "ultra";
       obj2.price = 100000;

       obj1.show();
        obj2.show();

   } 
}
