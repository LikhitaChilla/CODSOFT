import java.util.Scanner;
import java.util.*;
class users{
    static int balance;
    int op=0;
    int co=0;
    int pin;
    users(){
        Scanner sc=new Scanner(System.in);
    Random rn=new Random();
     balance=rn.nextInt(1000,10000);
    HashMap<Integer,Integer> user = new HashMap<Integer,Integer>();
    user.put(1234,6789);
    user.put(1678,7899);
    user.put(6734,8932);
    user.put(5623,7813);
    try{
    System.out.println("welcome dear user!!!\nENTER YOUR LAST FOUR DIGITS OF YOUR ACCOUNT NUMBER");
    
    int account_number=sc.nextInt();
    if(user.containsKey(account_number)){
        while (op!=4){
        System.out.println("SELECT THE APPLICATION...\n1.WITHDRAW\n2.BALANCE CHECKING\n3.DEPOSIT\n4.EXIT");
        op=sc.nextInt();
        if (co==0){
    
    System.out.println("enter the pin");
    pin=sc.nextInt();}
    if(user.get(account_number)==pin){
    switch (op){
        case 1:
            System.out.println("Enter the amount you want to withdraw...");
            int am1=sc.nextInt();
            withdraw(am1);
            break;
        case 2:    
            System.out.println("Your current balance is "+check_balance());
            break;
        case 3:
            System.out.println("Enter the amount you want to deposit!!");
            int am2=sc.nextInt();
            deposit(am2);  
            break;  
        case 4:
            System.out.println("THANK YOU FOR VISITING!!!");
            break;
        default:
            System.out.println("Enter a valid option");        


    }
    co++;

    }
    else{
        System.out.println("Wrong pin number");
        op=4;
    }
        }
    }
    else{
System.out.println("the account number doesn't exists");
       
    }

    }
    catch (Exception e){
        System.out.println("Wrong details have been entered");
    }
}
static void withdraw(int am1){
    if(balance>=am1){
        System.out.println("Wait while the transaction is being processed");
        System.out.println("collect your amount");
        balance=balance-am1;
    }
    else{
        System.out.println("You have no enough balance to withdraw amount");
    }
}
static int check_balance(){
    return balance;
}
static void deposit(int am2){
    System.out.println("Handover your cash to the following counter to deposit into your account!!");
    System.out.println("The amount "+am2+" is deposited into your account");
    balance+=am2;
}
}
    public class Atm_model{
        public static void main(String args[]){
            users x =new users();
        }
    } 
