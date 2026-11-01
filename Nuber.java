import java.util.List;
import java.util.ArrayList;
public class Nuber {
    public static List<String> Phone(String d){
List<String>ans = new ArrayList<>();
int n = d.length();
if(n ==0){
    return ans;
}
String num []= {"0" ,"1","abc" ,"def" ,"ghi" ,"jkl","mno","pqrs","tuv","wxyz"};
ans.add("");

for(int i=0; i<n; i++){
    List<String>temp = new ArrayList<>();
    String prev = num[d.charAt(i)-'0'];

    for(int j=0; j<ans.size(); j++){
        for(int k=0; k<prev.length(); k++){
            String combi = ans.get(i) + prev.charAt(k);
            temp.add(combi);
        }

    }
    ans =temp;

}
for(int i=0; i<ans.size(); i++){
    System.out.println(ans.get(i));
}

return ans;

    }

class Back{
public static void backtring(List<String>ans , int idx ,String curr ,String num[] ,String d){
if(idx == d.length()){
    ans.add(curr);
    return;
}
    String prev =num[d.charAt(idx)-'0'];
    for(int i=0; i<prev.length(); i++){
        String ch = curr+prev.charAt(i);
        backtring(ans ,idx+1, ch, num, d);
    }
}

public static List<String> Polo(String d){
List<String>ans = new ArrayList<>();
int n = d.length();
if(n ==0){
    return ans;
}
String num []= {"0" ,"1","abc" ,"def" ,"ghi" ,"jkl","mno","pqrs","tuv","wxyz"};

backtring(ans ,0 ,"" ,num ,d);

for(int i=0; i<ans.size(); i++){
    System.out.println(ans.get(i));
}
return ans;
}   
   
}
public static void main(String args[]){
Back.Polo("23");
    }
}
