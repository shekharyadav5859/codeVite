public class dp {
    public static int  clim(int n ){
        if(n ==1){
            return 1;
        }
        if(n== 2){
            return 2;
        }
        int first =1; 
        int sec =2;
        for(int i=3; i<=n; i++){
            int curr = first+ sec;
            first = sec;
            sec = curr;

        }
        System.out.println(sec);
        return sec;
    }
    public static void main(String args[]){
      System.out.print(Integer.bitCount(8));

    }
}
