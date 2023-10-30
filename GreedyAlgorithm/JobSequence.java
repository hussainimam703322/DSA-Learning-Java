import java.util.*;

public class JobSequence {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
           id=i;
           deadline=d;
           profit=p;
        }
    }
    public static void main(String[] args) {
        int JobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<JobsInfo.length;i++){
            jobs.add(new Job(i, JobsInfo[i][0], JobsInfo[i][1]));
        }
        Collections.sort(jobs,(job1,job2) -> job2.profit-job1.profit);
    
        ArrayList<Integer> seq = new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max size = " + seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
/*
 int[] JobScheduling(Job arr[], int n) {
    Arrays.sort(arr, (job1, job2) -> Integer.compare(job2.profit, job1.profit)); // Sort by profit in descending order

    int maxDeadline = 0;
    for (Job job : arr) {
        maxDeadline = Math.max(maxDeadline, job.deadline);
    }
    int[] slot = new int[maxDeadline];
    int totalProfit = 0;
    int jobCount = 0;

    for (Job job : arr) {
        for (int i = job.deadline - 1; i >= 0; i--) {
            if (slot[i] == 0) {
                slot[i] = job.id;
                totalProfit += job.profit;
                jobCount++;
                break;
            }
        }
    }
    return new int[]{jobCount, totalProfit};
    } 
 */