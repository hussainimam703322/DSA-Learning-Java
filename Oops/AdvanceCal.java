class AdvanceCal {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}
class Cal extends AdvanceCal {
    //@override
    public int add(int n1, int n2) {
        return n1 + n2 + 1; //return super.add(n1, n2) + 1
    }
}

class Demo {
    public static void main(String[] args) {
        AdvanceCal obj = new Cal();
        int result = obj.add(3, 4);
        System.out.println(result); // Output: 8
    }
}
