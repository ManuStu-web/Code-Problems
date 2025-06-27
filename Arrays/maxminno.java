import java.util.*;
public class maxminno
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int min , max;
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        min=a[0];
        max=a[0];
        
        for(int i=0;i<n;i++)
        {
            if(min>=a[i])
            {
              min=a[i];
            }
            if(max<=a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Maximum number is:" +max);
        System.out.println("Minimum number is:" +min);
    }
}