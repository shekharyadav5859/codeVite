public class queest{
    public static void main (String args[]){
        int nums[] ={1,3,-1,-3,5,3,6,7};
        int k =3;
        int n = nums.length;
        int ans [] = new int[n-k+1];
        
        for(int i=0; i<n-k+1; i++){
            int max =0;
            for(int j=i; j<i+k; j++){
               max = Math.max(max , nums[j]);

            }
            ans[i] = max;
        }

        for(int i=0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}