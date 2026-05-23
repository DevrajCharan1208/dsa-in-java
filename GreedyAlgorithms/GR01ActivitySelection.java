import java.util.*;
public class GR01ActivitySelection{
    
    public static int activitySelection(int[] start, int[] end){

        //1. Sort Activites according to end time
        int[][] activities = new int[start.length][2];
        for(int i = 0; i<start.length; i++){
            activities [i][0] = start[i];
            activities [i][1] = end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o -> o[1]));
        

        int count = 1;
        int curr_end = activities[0][1];
        for(int i = 0; i<start.length;i++){
            if(activities[i][0]>=curr_end){
                count++;
                curr_end = activities[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] start = {0,5,8,5,1,3};
        int[] end = {6,7,9,9,2,4};

        System.out.println(activitySelection(start, end));
    }
}