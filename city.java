import java.util.Queue;
import java.util.LinkedList;
public class city {

    public static void pre(int cdt[][], boolean vist[] , int i){
        Queue<Integer>q =new LinkedList<>();
        q.add(i);
        vist[i] = true;

        while(!q.isEmpty()){
            int curr = q.remove();
            for(int j=0; j<cdt.length; j++){
                if(cdt[curr][j] == 1 &&  !vist[j]){
                    vist[j]= true;
                    q.add(j);

                }
            }
        }
       
    }
   public static void main(String args[]){
   int cdt[][] ={{1,0,0},{0,1,0},{0,0,1}};
   int ans =0;
   boolean vist[] = new boolean[cdt.length];
   for(int i=0; i<cdt.length; i++){
    if(!vist[i]){
        pre(cdt ,vist ,i);
        ans++;
    }

   }


   System.out.println(ans);
   }
    
}
