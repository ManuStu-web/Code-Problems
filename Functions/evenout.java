import java.util.*;
public class evenout
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the the number ");
        int a=in.nextInt();

        eo(a);

    }

    static void eo(int a)
    {
        if(a%2==0)
        System.out.println("Even");
        else
        System.out.println("odd");
    }
}