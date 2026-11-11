import java.util.*;
public class graph{
   static  class Edge{
        int v;
        int u;
       public Edge(int v, int u){
            this.v = v;
            this.u =u;
        }

   
    }
         public static void gra(int e , int ver,Scanner sc){
            List<Edge>graph[] =new ArrayList[ver];
            for(int i=0; i<ver; i++){
                graph[i] = new ArrayList<Edge>();
            }

        for(int i=0; i<e; i++){
            System.out.print("Enter the src");
            int v =sc.nextInt();
            System.out.print("Enter the dest");
            int u =sc.nextInt();


            graph[v].add(new Edge(v ,u));
            graph[u].add(new Edge(u ,v));
        }

         
         for(int i=0; i<ver; i++){
            System.out.print(i+ "->");
            for(Edge edge:graph[i]){
                 System.out.print(edge.u);
            }
            System.err.println();
         } 
         
        }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Edges of Number");
    int e = sc.nextInt();
    System.out.println("Enter the Number of Vertex");
    int v =sc.nextInt();

      gra(e ,v ,sc);
      sc.close();
    }
}