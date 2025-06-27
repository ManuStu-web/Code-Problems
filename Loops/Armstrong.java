import java.util.*;
public class Armstrong
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,n,t;
        double count=0,r=0 ,sum=0;

        System.out.println("Enter the number");
        a=in.nextInt();
        n=a;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        t=a;
        for(int i=1;i<=count;i++)
        {
            r=t%10;
            sum=sum+Math.pow(r,count);
            t=t/10;
        }

        if(sum==a)
        {
        System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Nooo");
        }
    }
}