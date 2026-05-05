//A string of directions is given 'ex: "WNEENESENNN"', find shortest distance after moving 1 unit in the given direcetions

public class S01ShortestPath{

    public static float shortestPath(String str){
        int n = str.length();
        int x = 0;
        int y = 0;

        for(int i = 0; i < n; i++){
            if(str.charAt(i) == 'E'){
                x++;
            }
            if(str.charAt(i) == 'W'){
                x--;
            }
            if(str.charAt(i) == 'N'){
                y++;
            }
            if(str.charAt(i) == 'S'){
                y--;
            }
        }

        return (float)Math.sqrt(x*x + y*y);

    }

    public static void main(String[] args) {
        String str = "NNNNNNNNNNEEEEEEEEEE";
        System.out.println(shortestPath(str));
    }
    
}