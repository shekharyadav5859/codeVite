public class five {


    public static int[][] generateMatrix(int n) {
       
          int matrix[][] = new int[n][n];
        int count = 1;

        int t = 0;
        int l = 0;
        int b = n - 1;
        int r = n - 1;

        while(t <= b && l <= r) {

        
            for(int i = l; i <= r; i++) {
                matrix[t][i] = count++;
            }
            t++;

        
            for(int i = t; i <= b; i++) {
                matrix[i][r] = count++;
            }
            r--;

            if(t <= b) {
                for(int i = r; i >= l; i--) {
                    matrix[b][i] = count++;
                }
                b--;
            }

     
            if(l <= r) {
                for(int i = b; i >= t; i--) {
                    matrix[i][l] = count++;
                }
                l++;
            }
        }

        return matrix;
    }
    public static void main(String args[]){
    String str =""+1;

    System.out.println(str);

    }
}
