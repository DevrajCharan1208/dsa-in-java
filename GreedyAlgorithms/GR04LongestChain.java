
import java.util.Arrays;
import java.util.Comparator;

public class GR04LongestChain{

    public static int longestPairChain(int[][] pairs){
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int chain = 1;
        int curr_end = pairs[0][1];
        for(int i = 1; i<pairs.length;i++){
            if(pairs[i][0]>=curr_end){
                chain++;
                curr_end = pairs[i][1];
            }
        }
        return chain;
    }

    public static void main(String[] args) {
        int[][] pairs = {{5,24},{93,60},{5,28},{27,40},{50,90}};
        System.out.println(longestPairChain(pairs));
    }
}