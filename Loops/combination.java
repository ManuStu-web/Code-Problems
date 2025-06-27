import java.util.*;
public class combination
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int npr ,ncr ,n1=1, n2=1,n3=1, diff , n ,r;

        System.out.println("Enter the values of n and r");
        n=in.nextInt();
        r=in.nextInt();
        
        for(int i=2;i<=n;i++)
        {
            n1=n1*i;
        }

         diff =(n-r);

        for(int i=2;i<=diff;i++)
        {
            n2=n2*i;
        }

        for(int i=2;i<=r;i++)
        {
            n3=n3*i;
        }

        npr=n1/n2;
        ncr=npr/n3;

        System.out.println("Combination :" +ncr);
        System.out.println("Permutation :"+npr);


    }
}
