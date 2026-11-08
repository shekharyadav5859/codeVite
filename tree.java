public class tree {

    static void fun(int i) {

        if (i == 4) {
            return;
        }

        System.out.println("Before: " + i);

        fun(i + 1);

        System.out.println("After: " + i);
    }

    public static void main(String[] args) {
       String arr[] = {"abc","abc","abc2"};
         int count =1;
         String num ="";
        for(int i=0; i<arr[0].length(); i++){
            char ch = arr[0].charAt(i);
            if(ch>='0' && ch<='9'){
                num+=ch;
                
            }
        }
        if(num.equals("")){
            num = num+'0';
        }
        count = Integer.parseInt(num);
        System.out.println(count);
    //     ++count;
    //     String str= arr[1];
    //    String ans = str+count;
    //    System.out.println(ans);
        
    }
}