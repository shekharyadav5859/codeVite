import java.util.ArrayList;
import java.util.List;

public class iv{
     public static List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>>list = new ArrayList<>();
      
        for(int i=0; i<s1.length(); i++){
            List<String>curr = new ArrayList<>();
            String first = "";
            String sec ="";
            while( i<s1.length() && s1.charAt(i) != s2.charAt(i) ){
               
                first+=s1.charAt(i);
                sec+=s2.charAt(i);
                
                System.out.println(i);
                i++;
            }
            if(first.length()>0 && sec.length()>0 && first.length() == sec.length()){
              
                curr.add(first);
                curr.add(sec);
         
            }
            if(curr.size()>0){
                list.add(curr);
            }
        }
     for(int i=0; i<list.size(); i++){
        System.out.println(list.get(i));
     }

        return list;
    }
    public static void main(String args[]){
   int arr[] = {1,2,3};
   for(int i=0; i<arr.length; i++){
    arr[i] =arr[i+1];
    System.out.println(arr[i]);
   }

    }
}