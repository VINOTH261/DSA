import java.util.*;
public class Main
{
public static void main(String[] args) {
//int n=10;
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   if(a%4==0 && a%100!=0){
       System.out.println("Leap Year");
   }
   else{
       System.out.println("Not a Leap Year");
   }
}
}

