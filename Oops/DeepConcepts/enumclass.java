package DeepConcepts;

enum Laptop {
    ThinkPad(45000), IdeaPad(0), Samsung(80000), MSI(100000);

    private int price;

    private Laptop() {
        price = 34000; // Default price
    }

    private Laptop(int price) {
        this.price = price;
        
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enumclass {
    public static void main(String[] args) {
        Laptop lap = Laptop.Samsung;
        System.out.println(lap + " : " + lap.getPrice());

        // for(Laptop lap : Laptop.values()){
        //     System.out.println(lap + " : " + lap.getPrice());
        // }
    }
}
