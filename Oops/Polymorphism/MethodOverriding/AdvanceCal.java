package Polymorphism.MethodOverriding;

class AdvanceCal {
    public int add(int n1, int n2) {
        return n1 + n2+1;
    }
}
class Cal extends AdvanceCal {
    //@override
    public int add(int n1, int n2) {
        return n1 + n2 + 2; //return super.add(n1, n2) + 1
    }
}

class Demo {
    public static void main(String[] args) {
        Cal obj = new Cal();
        int result = obj.add(3, 4);
        System.out.println(result); // Output: 8
    }
}
