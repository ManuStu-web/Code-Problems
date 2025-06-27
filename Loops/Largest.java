//Largest of the three numbers

import java.util.*;
public class Largest
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a, b, c , max ;
        char v;
        System.out.println("Enter the value of  variables");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
         max=a;
         v='A';
        if(a<b)
        {
            max=b;
            v='B';
        }
        if(a<c)
        {
            max=c;
            v='C';
        }

            System.out.println("The largest value is of variable " + v + " which is " + max);

        if(max==a&&a==b)
        {
            System.out.println("Both A and B are the largest with same value :" + max);
        }

        if(max==a&&a==c)
        {
            System.out.println("Both A and C are the largest with same value:"+max);
        }

        if(max==b&&a==c)
        {
            System.out.println("Both C and B are the largest with same value:"+max);
        }
        
        

    }
}