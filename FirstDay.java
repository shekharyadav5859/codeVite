import java.util.*;
public class FirstDay {
 class Node{
    int data;
    Node next;

         Node(int data){
        this.data = data;
        this.next = null;
    }
 }
 public static void list(){
   Scanner sc = new Scanner(System.in);
   Node head = null;
   Node tail = null;
   int n = sc.nextInt();
   for(int i=1; i<=n; i++){
    int num = sc.nextInt();

  
   }
 }
  
 
    public static void main(String args[]){









        LinkedList<Integer>list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the List size");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
        System.out.println("enter the Node");
         int num = sc.nextInt();
         list.add(num);
        }

        System.out.print(list.size());
        while(list != null){
            
        }

    }
    
}
