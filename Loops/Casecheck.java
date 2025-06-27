//to check the weather given input is Uppercase or lowercase

import java.util.*;
public class Casecheck
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("ENter the word");
        String a = in.next();
        int count=0;

        for(int i=0;i<a.length();i++)
        {
            char ch= a.charAt(i);
            if(ch>='A'&&ch<='Z')
            {
              count++; 
            }
        }
        if(count==a.length())
        {
            System.out.println("UpperCase");
        }
        else
        System.out.println("Lowecase");

    }

}