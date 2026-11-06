public class SecDay {
    public static void print(int n){
         if(n<1){
            return ;
         }
        System.out.println(n);
        print(n-1); 
    }
    public static void re(int n ,int i ){
        if(i>n){
            return ;
        }
        System.out.println(i);
        re(n ,i+1);
    }
    public static void fe(int n , int i){
        if(i>n){
            return;
        }
        int mul =1;
        for(int j=1; j<i; j++){
            mul *= j;
        }
        System.out.println(mul);

        fe(n ,i+1);
    }
    public static int  feII(int n){
        if(n ==0 || n==1){
            return 1;
        }
      
        int q=  n*feII(n-1);
        System.out.println(q);
        return q;
    }
    public static void main(String args[]){
    feII(10);
    }
    
}
