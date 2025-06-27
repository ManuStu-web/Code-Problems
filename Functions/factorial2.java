import java.util.*;
public class factorial2 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number");
        int m = in.nextInt();

        fact(m);
    }

    static void fact(int n)
    {
        int prod=1;
        for(int i=2;i<=n;i++)
        {
            prod=prod*i;
        }

        System.out.println("Factorial is :" +prod);
    }
}

