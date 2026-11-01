import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class DandC {
   static class Edge{
        int src;
        int dest ;

         Edge(int src ,int dest){
            this.src =src;
            this.dest = dest;
                }
    }
    public static void graph(int v,int e){
        List<Edge>graph[] = new ArrayList[v];
        Scanner sc =new Scanner(System.in);
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

       graph[1].add(new Edge(1,2));
       for(int i=0; i<e; i++){
        int s =sc.nextInt();
        int d = sc.nextInt();
        graph[i].add(new Edge(s ,d));
       }

       for(int i=0; i<v; i++){
        for(Edge edge:graph[i]){

            System.out.println();

        }
       }
    }

    public static void main(String args[]){

    }
    
}
