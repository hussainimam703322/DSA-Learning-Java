import java.util.*;

public class ActivityselectionUnsorted {
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5,};
        int end[] = {2,4,6,7,9,9};

        //created 2D array and then sorting
        int activities[][] = new int[start.length][3];
        for(int i=0;i<activities.length;i++){
            activities[i][0] = i; //store kiye hai original index after sorting acitivty up and down ho jayega then its store original index
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        //lamda function in java
        //comparator decide how to sort in 2D arrays
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
                                       //                             column
        int maxAct = 1;                    //at 0 index stored          |i |s |e |
        ans.add(activities[0][0]);     //at 1 start stoed      Row  |0 |1 |2 |
        int lastend = activities[0][2]; //at 2 end stored           |  |  |  |

        for(int i=1;i<end.length;i++){
            if(activities[i][1] >= lastend){
                maxAct++;
                ans.add(activities[i][0]);
                lastend = activities[i][2]; //lastend ab last activity ka end ho jayega

            }
        }
        System.out.println("Max activity " + maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
