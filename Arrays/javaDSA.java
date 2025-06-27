import java.util.*;
public class javaDSA
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int a[]= new int[5];
    
    for(int i=0;i<5;i++)
    {
      a[i]=in.nextInt();
    }
    int min=a[0];
    int c=0;
    
    for(int i=0;i<5;i++)
    {
      if(a[i]>=min)
      {
        c++;
        min=a[i];
      }
    }
    if(c==5)
    {
      System.out.println("sorted hai!");
    }
    else
    {
      System.out.println("nahi hai sorted");
    }
    
  }
}
