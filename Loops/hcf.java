import java.util.*;
public class hcf 
{
   public static void main(String[] args) 
   {
    Scanner in = new Scanner(System.in);
    int max,CD=1,maax=1;
    System.out.println("Enter the numbers");
    int a=in.nextInt();
    int b=in.nextInt();

    if(a>=b)
    {
        max=a;
    }
    else
    {
        max=b;
    }

    for(int i=1;i<max;i++)
    {
        if((a/i)==0&&(b/i)==0)
        {
            CD=i;
        }

        if(CD>=maax)
        {
            maax=CD;
        }
    }

    System.out.println("HCF is :" +maax);
   }
}
