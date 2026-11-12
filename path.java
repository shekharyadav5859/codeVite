import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class path {
    static class Edge{
        int src;
        int dest;
        public Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }

    }
    public static boolean dfs(List<Edge>graph[] ,int src , int dest , boolean vist[]){
        if(src== dest){
            return true;
        }
        vist[src] = true;
        for(Edge edge:graph[src]){
           if(!vist[edge.dest]){
             if(dfs(graph , edge.dest ,dest,vist)){
                return true;
            }
           }
        }
        return false;
    }

    public static void graph(int v , int e , Scanner sc , int start , int end){
        List<Edge>graph[] = new ArrayList[v];
        boolean vist[] = new boolean[v];
        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<Edge>();

        }
        for(int i=0; i<e; i++){
            System.out.print("Enter the src");
            int src = sc.nextInt();
            System.out.print("Enter the dest");
            int dest = sc.nextInt();

            graph[src].add(new Edge(src,dest));
            graph[dest].add(new Edge(dest ,src));

        }

       System.out.println( dfs(graph ,start , end ,vist));

    }
    public static void main(String agrs[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the v");
    int v = sc.nextInt();
    System.out.println("Enter the edge");
    int e = sc.nextInt();
    graph(v ,e ,sc ,0 ,2);




sc.close();
    }
}
