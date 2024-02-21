

public class Setbitmask {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;
        int bitmask = 1<<i;
        int newNumber = bitmask | n;
        System.out.println(newNumber);
    }
}
