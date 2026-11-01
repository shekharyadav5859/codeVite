import java.util.*;
 
interface InnerOops {
public void  run();
    
}

class Man implements InnerOops{
    public void run(){
System.out.println("run for 3legs");
    }
}

//methodOverLoding
class Poly{
      //Scanner sc =new Scanner(System.in);
    public void add(int a,int b){
        System.out.println(a+b);
    }


    public void add(int a,int b ,int c){
        System.out.println(a+b+c);
    }
}

class School{
    public void meb(){
       Scanner sc =new Scanner(System.in);
       System.out.println("enter your name");
       String name = sc.nextLine();

    }

    public int meb(int age){
Scanner sc = new Scanner(System.in);

age = sc.nextInt();
System.out.println(age);
return 1;
    }
}

//methodOverRideing

class Bank{
    double getRate(){
        return 0.0;
    }
}

class Sbi extends Bank{
    @Override
    double getRate(){
        return 6.5;
    }
}
class Boi extends Bank{
    @Override
    double getRate(){
        return 9.5;
    }
}

//Data hading

class Encapsulation{
    private double balance;

    public double getbalance(){
        System.out.println(balance);
        return balance;
    }

    public void deposite(double amount){
        if(amount>0){
            balance =+  amount;
            //System.out.println(balance);

        }
        else{
            System.out.println("this is not velit");
        }

    }
}

// abtracatioin 

abstract class Animal{
    abstract void waka();
}

class Sb extends Animal{

   public void waka() {
        System.out.println("Animal walks");
    }
}

//100% intertface depend abstract

interface heen {
    void woka();
   int legs = 4;
}
class P implements heen{
public void woka(){
    System.out.println("it is eat");
}
}


public class Oops {
    public static void main(String argu[]){
P a= new P();
a.woka();

Sb s =new Sb();
s.waka(); 



// Encapsulation e = new Encapsulation();
// e.deposite(90);
// e.getbalance();

 









    }
}
