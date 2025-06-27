/* You have to reverse a number ex- 12345 o/p---> 54321 */
import java.util.*;
public class reverse
 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=in.nextInt();
        int o;
        while(a>0)
        {
            o=a%10;
            System.out.print(o + " ");
            a=a/10;

        }
    }
}
