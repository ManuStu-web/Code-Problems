import java.util.*;
public class kth_number
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i, count1=0,count2=0,n;
        System.out.println("enter the size");
        n=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        int sm=a[0];
        int la=a[0];
        System.out.println("enter the kth");
        int k=in.nextInt();
        for(i=0;i<n;i++)
        {
            if(sm>a[i])
            {
                count1++;
            }
            if(count1==(k-1))
            {
                System.out.println(a[i]);
            }
        }

        for(i=0;i<n;i++)
        {
            if(la<a[i])
             {
                la=a[i];
             }
        }

        for(i=0;i<n;i++)
        {
            if(la<a[i])
            {
                count2++;
            }
            if(count2==(k-1))
            {
                System.out.println(a[i]);
            }
        }
    }
}