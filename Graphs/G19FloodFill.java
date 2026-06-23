
public class G19FloodFill{
    public static  int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];

        int original = image[sr][sc];
        helper(image, sr, sc, color, original , vis);
        return image;
    }

    private static void helper(int[][] image, int sr, int sc, int color, int original,boolean[][] vis){
        if( sr < 0 || sc < 0 || sr >= image.length || sc>=image[0].length){
            return;
        }
        if(image[sr][sc] != original){
            return;
        }
        if(vis[sr][sc] == true){
            return;
        }
        image[sr][sc] = color;
        vis[sr][sc] = true;
        

        //left
        helper(image, sr, sc-1, color, original, vis);
        //right
        helper(image, sr, sc+1, color, original, vis);
        //up
        helper(image, sr-1, sc, color, original, vis);
        //down 
        helper(image, sr+1, sc, color, original, vis);

    }

    public static void main(String[] args) {
        int[][] images = {{1,1,1},
                          {1,1,0},
                          {1,0,1}};

        int[][] ans = floodFill(images, 1, 1, 2);

        for (int i = 0; i < images.length; i++) {
            for(int j = 0; j < images[0].length; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("");
        }
                                
    }
}