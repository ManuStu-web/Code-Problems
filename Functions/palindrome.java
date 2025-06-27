import java.util.*;
public class palindrome 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        palin(n);

    }

    static void palin(int m)
    {
        int org = m;
        int sum=0;
        while(m>0)
        {
         int rem = m%10;
         sum= (sum*10)+rem;
         m=m/10;
        }

        if(sum==org)
        {
           System.out.println("Palindrome");
        }
        else
        System.out.println("NOPE");

    }
}
