package Java.backtracking;

//Count the ways , how can we reach the end.
public class countways 
{
  public static void main(String[] args) 
  {
    int ans = countss(3, 3);
    System.out.println(ans);
  }  
  
  static int countss(int r , int c)
  {
    if(r==1 || c==1)
    {
        return 1;
    }

    int left = countss(r,c-1);
    int right = countss(r-1,c);

    return left+right;
  }
}
