package DeepConcepts;

class Anonymous {
    static class A {
        public void show() {
            System.out.println("in show");
        }
    }
   public static void main(String[] args) {
        A obj = new A() {
        public void show() {
            System.out.println("new in show");
            }
        };
        obj.show();
        
    }
}
//here both have same method but compiler will give output which is anonymous 