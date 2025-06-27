import java.util.*;
public class lcm
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int a , b;
        System.out.println("Enter the numbers");
        a=in.nextInt();
        b=in.nextInt();

        int x = (a>=b)?a:b;
        int min =x , min2=x;
        // for(int i=1;i<x;i++)
        // {
        //   if((a%i)==0&&(b%i)==0)
        //   {
        //     min2=i;
        //   }

        //   if(min2<=min)
        //   {
        //     min=min2;
        //   }
        // }

        for(int i=1;i<x;i++)
    {
        if((a/i)==0&&(b/i)==0)
        {
            min2=i;
        }

        if(min2<=min)
        {
            min=min2;
        }
    }

        System.out.println(min);
    }
}