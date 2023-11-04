/*
There are N stairs, and a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. 
Count the number of ways, the person can reach the top
 */
public class climbingstairs {
    public static int countways(int n){
        if(n == 0){
            return 1;
        }
        else if(n<=0){
            return 0;
        }
        return countways(n-1) + countways(n-2);
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(countways(n));
    }
}
/*
in this suppose n =4 then,
number of ways- 1111(this comes from n=3 & n=2),112,121,211,22(this comes from n=2).
in this ways we can climb the stairs ,
for n =3
number of ways - 111,12,21
PATTER BETWEEN N=3 AND N=4
both are looking same pattern only difference is that we add 1 in last 
for n=3 we can se n=2 ,count ways = 11,2
we add same digit in the ways of n=2 
like this we can calulate by seeing previous n 

 */