public class A15SearchSortedMatrix{

    public static boolean isPresent(int[][] matrix,int key){
        int n = matrix.length;
        int m = matrix[0].length;

        int row = 0;
        int col = m-1;

        while(row<=n-1 && col >=0){
            if (matrix[row][col]==key){
                System.out.println("key " + key + " is present in the matrix at (" + row + "," + col + ").");
                return true;
            }else if(matrix[row][col]>key){
                col--;
            }else{
                row++;
            }

        }
        System.out.println("key " + key + " is not present in the matrix.");
        return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,38},
                          {32,33,39,50}};

        isPresent(matrix, 33);
    }
    
}