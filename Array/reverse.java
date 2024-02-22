package CoreJava.Array;
public class reverse {
    public static void main(String[] args) {
        int num = 23597;
        int ans = 0;

        while(num > 0){
            int rem = num % 10; //7 remainder 
            num /= 10; // 2359 quotient
            ans = ans * 10 +  rem; // 0 * 10 + rem = 7
        }
        System.out.println(ans);
    }
}
