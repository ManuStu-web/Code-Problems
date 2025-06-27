//subtract the sum and product of digits
import java.util.*; 
public class sum_pro {
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number");
        int a=in.nextInt();
        int check=a ,sum=0 , prod=1;
        
        while (check!=0) {
            int rem=check%10;
            sum=sum+rem;
            prod=prod*rem;
            check=check/10;
        }
        int ans=prod-sum;

        System.out.println("YOur answer is :"  +ans);
    }
}
