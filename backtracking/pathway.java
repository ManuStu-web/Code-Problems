package Java.backtracking;

public class pathway 
{
    public static void main(String[] args) 
    {
       printway(3, 3, "");
    }

    static void printway(int r , int c , String ans)
   {
    if(r==1 && c==1)
    {
        System.out.println(ans);
        return;
    }
    if(c>1)
    printway(r,c-1,ans+'R');

    if(r>1)
    printway(r-1,c,ans+'D');
   }

   

}
