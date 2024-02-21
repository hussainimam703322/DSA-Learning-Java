

public class Clearbitmask {
    public static void main(String[] args) {
        int n = 5;
        int i = 2;
        int bitmask = 1<<i; 
        int notBitmask = ~(bitmask);

        int newnumber = notBitmask & n;
        System.out.println(newnumber);
    }
}
