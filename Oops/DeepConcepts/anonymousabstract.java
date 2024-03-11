package DeepConcepts;

class anonymousabstract {
    static abstract class A{
        public abstract void show();
    }
    public static void main(String[] args) {
    //we have created object of anonymous inner abstract class not abstract class    
        A obj = new A()
        {
            public void show(){
                System.out.println("abstract anonymous inner class");
            }
        };
        obj.show();
    }
}
