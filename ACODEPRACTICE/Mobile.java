
class Mobile{
    static String name;
    static String brand;
    int price;

    public void show(){ //this is non static method but we can use static variable,it will not harm
        System.out.println(name + " : " + brand + " : " + price);
    }

}
class Demo{
     public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.name= "S21";
        obj1.brand= "SAMSUNG";
        obj1.price = 350000;

        Mobile obj2 = new Mobile();
        obj2.name= "15Pro";
        obj2.brand= "APPLE";
        obj2.price = 550000;

        Mobile obj3 = new Mobile();
        obj3.name= "11Pro";
        obj3.brand= "Nokia";
        obj3.price = 650000;

        obj3.name = " 20proMax"; //we are only changing the value in object2
        //it also change the value of object 1 with same value;
        obj1.show();
        obj2.show();
        obj3.show();
     }
        
    
}
/*
static varibles are shared by different object and it called my classname(Mobile.name) mainly not object name(obj1.name);
1.if we declare static as instance variable then all the object have same value in any method,mainly last object  value will be assign in  above objects
2.if we declare another 3rd object and and one of its variable are static instance variable ,if we not call this object , that static variable value will automatically assign to all other above object having same varible .

4.if we want to change value of a variable which is declared as STATIC instance variable already, then if we update 
in any  variable of obj1 , obj2, obj3, then all will have same value in variable in respective objects.

lets we are changing variable of obj2 then all object will get assign value of obj2  automatically in all the varibles of obj1 and obj3.
 
*/