public class Gcd{

    public static int GCD(int a ,int b){
        while(b != 0){
            int rem =a%b;
            a= b;
            b =rem;
        }
        return a;
    }
    public static void LCM(int arr[]){
        if(arr.length<2){

        }
        int a = arr[0];
      for(int i=1; i<arr.length; i++){
        
        int b =arr[i];
        int gcd = GCD(a,b);
        int curr = a*b/gcd;
        a= curr;


      }
     

    }
    public static int gcdOfOddEvenSums(int n) {
        int sumOdd = 1;
        int sumEven =0;
        int a =sumOdd;
        int b =0;
        
        for(int i=0; i<n-1; i++){
           
            sumOdd+=2;

            a+=sumOdd;

        }
       
        for(int i=0; i<n; i++){
            sumEven+=2;
            b+=sumEven;

        }
        System.out.println(b);
     int ans =   GCD(a,b);
     
     return ans;
    }
    public static void main(String args[]){
      int n =-5;
      System.err.println(n/-1);
      
    }
}