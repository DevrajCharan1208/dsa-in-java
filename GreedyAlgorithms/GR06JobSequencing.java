
import java.util.ArrayList;
import java.util.Arrays;

public class GR06JobSequencing{
    public static ArrayList<Integer> jobSquencing(Job[] jobs){
        int n = jobs.length;
        Arrays.sort(jobs, (a,b) -> b.profit-a.profit);
        int[] result = {0,0};
        boolean[] time = new boolean[n+1];

        ArrayList<Integer> sequence = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(!time[jobs[i].deadline]){
                result[0]++; result[1]+=jobs[i].profit;
                sequence.add(jobs[i].id);
                time[jobs[i].deadline] = true;
            }
        }
        return sequence;
    }

    
    public static class Job{
        int id;
        int deadline;
        int profit;

        Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

        Job jobs[] = new Job[jobsInfo.length];

        for(int i = 0; i<jobs.length;i++){
            jobs[i] = new Job(i,jobsInfo[i][0],jobsInfo[i][1]);
        }

        System.out.println(jobSquencing(jobs));
    }
}