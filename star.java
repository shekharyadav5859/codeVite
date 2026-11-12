import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class star {
    static class Edge{
        int src;
        int dest;
        public Edge(int src ,int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    public static int find(int edges[][]){
        if(edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]){
            return edges[0][0];
        }
        return edges[0][1];
    }
    public static void graph(int e , int v , Scanner sc,int matrix[][]){
         List<Edge>graph[] = new ArrayList[v];
         for(int i=0; i<v; i++){
            graph[i] = new ArrayList<Edge>();
         }
         for(int i=0; i<matrix.length; i++){
           int src =matrix[i][0];
           int dest = matrix[i][0];
           graph[src].add(new Edge(src ,dest));
           graph[dest].add(new Edge(dest ,src));
 }

    }

    public static void main(String args[]){
        int edges[][] ={{1,2} ,{2,1},{1,3},{4,1}};
        System.out.println(find(edges));

    }
}
