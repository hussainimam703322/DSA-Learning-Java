package DeepConcepts;

class Laptop{
    String model;
    int price;

    public String toString(){
        return model + ":" + price ;
    }
    public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price == that.price;
    }
}
class objectclasstostring{
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo ideapad";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo ideapad";
        obj2.price = 1000;

        boolean result = obj1.equals(obj2);
        System.out.println(result);
    }
}
/*
NOTE;
1.Two object are equal if they have same value and hashcode
2.If we use equals then it will compare both object based on different hashcode
3.So we need to make a method equals in which we need to pass a object for comparison
so it will comapare based on variable value;
 */