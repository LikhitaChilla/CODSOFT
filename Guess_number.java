import java.util.Scanner; 
import java.util.Random;

public class Guess_number  {
   static Random rn=new Random();
    static int x=rn.nextInt(101);
   static int check(){
        System.out.println("do you want to play again yes or no");
        Scanner s= new Scanner(System.in);
        int t;
    try{
        String ag=s.nextLine();
        if(ag.toLowerCase().equals("yes")){
            System.out.println("Let's go again");
            t=0;
            x=rn.nextInt(101);
            return t;
        }
        else if(ag.toLowerCase().equals("no")){
            System.out.println("had a nice one ");
             t=6;
            return t;
        }
        else{
            System.out.println("It seems you are not interested....let's stop");
            t=6;
            return t;
        }
    }
    catch(Exception e){
        System.out.println("quitting ");
        return -1;
    }
    
   }
    static int ag(){
        Scanner st= new Scanner (System.in);
        try {
System.out.println ("enter a Number between 0 and 100");
int u=st.nextInt();
return u;

}
catch(Exception e){
    System.out.println("invalid");
    return -1;
}
  
    }
public static void main(String args[]){
 int c= 0;
 Scanner sc=new Scanner(System.in);

int y=0;
while ( c<=5){
    y=ag();

if(x==y){
    System.out.println("it is a correct guess"+x);
    c=check();
    
}
else{
    if(c==4){
        System.out.println("you didn't make a correct guess");
        System.out.println("The number is,"+x);
        c=check();
    }
    else{
    System.out.println("guess again");
    c+=1;
    }
   
}
}
}
}