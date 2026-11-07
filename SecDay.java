
import java.util.*;
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

    public static int Febonic(int n){
         if(n ==0){
            return 0;
         }
         if(n==1){
            return 1;
         }
         int q= Febonic( n-1)+ Febonic(n-2);
         System.out.println(q);
         return q;

    }
public static void backI(List<List<Integer>>list , List<Integer>curr ,int i, int nums[] ){
   if(i==nums.length){
    list.add(new ArrayList<>(curr));

   }
    curr.add(nums[i]);
    
    back(list ,curr, i+1, nums);
   
   
}

  public static void back( List<List<Integer>> result, List<Integer>curr , int idx, int nums[]){
        if(idx==nums.length){
          result.add(new ArrayList<>(curr));
            return;
        }
curr.add(nums[idx]);      
back( result ,curr ,idx+1 ,nums);
curr.remove(curr.size()-1);
back(result,curr ,idx+1,nums);

       
        
    }

    public static void fun(int n) {
    if(n == 3) {
        System.out.println("Base");
        return;
    }

    System.out.println("Before " + n);
    fun(n+1);
    System.out.println("After " + n);
}

public static void sub(List<List<Integer>>list , List<Integer>curr , int i , int nums[]){
if(i== nums.length){
    list.add(new ArrayList<>(curr));
    return;
}

curr.add(nums[i]);
sub(list , curr , i+1, nums);

curr.remove(curr.size()-1);

sub(list , curr , i+1, nums);

}

    public static void main(String args[]){
       String str ="abcdefghijkl";
       int i=2;
       char ch = str.charAt(i);
       System.out.println(str.charAt(++i));

    }
    
}
