//input the values and operate till user presses 'X'or'x'

import java.util.*;
public class calculator 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float a,b;
        String ch , c;
        System.out.println("Welcome to Calculator , press V to start (to close please press X one time) ");
        ch =in.next();
        while (ch!="X"|| ch!="x") 
        {
            System.out.println("Enter the first value");
            a=in.nextInt();
            System.out.println("Enter the Second value");
            b=in.nextInt();
            System.out.println("What you want to do:- Sum , Diff , Mul , Div , Rem");
            c=in.next();

             if(c=="sum")
             {
                System.out.println("Addition of these 2 is:" + (a+b));
             }
             else if(c=="diff")
             {
                System.out.println("diffrnece of these 2 is:" + (b-a));
             }
             else if(c=="mul")
             {
                System.out.println("multiply of these 2 is:" + (a*b));
             }
             else if(c=="div")
             {
                System.out.println("division of these 2 is:" + (b/a));
             }
             else if(c=="rem")
             {
                System.out.println("Remeanider of these 2 is:" + (a%b));
             }
             else
             {
                System.out.println("INVALID!");
             }
             System.out.println("Want to continue? , press v to continue else X to close");
             ch=in.next();
        }
    }
}
