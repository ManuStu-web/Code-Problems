/*Tell how many times a number is repeting in a given number 
 ex- 74357372 
 no-7
 o/p----> 3 times
 */

 import java.util.*;
 public class repeatingnumb
 {
       public static void main(String args[])
       {
        Scanner in = new Scanner(System.in);
        int a , temp=0 , b ,c ;
        System.out.println("Enter the number");
        a=in.nextInt();
        System.out.println("Enter the number you want to find");
        int n=in.nextInt();

          b=a;
        while(b>0)
        {

         c=b%10;
         if(c==n)
         {
            temp++;
         }
         b=b/10;
        }

        System.out.println("Your no appeared " + temp + " times");
       }
 }