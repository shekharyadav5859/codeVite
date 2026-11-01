import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main { 
    static class Edge{
        int s;
        int d;
        int w;

        public Edge(int s ,int d ,int w){
            this.s = s;
            this.d =d;
            this.w =w;
        }
    }
    public static void graph(int v,int e ,Scanner sc){
        
        List<Edge>graph[] = new ArrayList[v];

        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }
        for(int i=0; i<e; i++){
            int src= sc.nextInt();
            int dest = sc.nextInt();
            int w = sc.nextInt();

            graph[src].add(new Edge(src,dest ,w));
             
        }

        for(int i=0; i<v; i++){
            for(int j=0; j<graph[i].size(); j++){
                Edge edge =graph[i].get(j);

                System.out.print(""+edge.s +" "+ edge.d+" "+edge.w);
            }
        }
    }

  public static void main(String args[]){
   String number []={"00" ,"00","abc" ,"def" ,"ghi" ,"jkl","mno","pqrs","tuv","wxyz"};
  
   String num = "23";
    String stor[] = new String[num.length()];
  for(int i=0; i<num.length(); i++){
int n= num.charAt(i)-'0';
   stor[i] = number[n];

    
  }
   for(int i=0; i<stor.length; i++){
   System.out.println(stor[i]);
   }
  }  
}
