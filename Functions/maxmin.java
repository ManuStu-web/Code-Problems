import java.util.*;
public class maxmin
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();


        min(x, y, z);
        max(x, y, z);
    }

    static void min(int a , int b ,int c)
    {
        int min = (a<=c&&a<=b)?a:(b<=c&&b<=a)?b:(c<=a&&c<=b)?c:0;
        System.out.println(min);
    }

    static void max(int a , int b ,int c)
    {
        int max = (a>=c&&a>=b)?a:(b>=c&&b>=a)?b:(c>=a&&c>=b)?c:0;
        System.out.println(max);
    }


}



