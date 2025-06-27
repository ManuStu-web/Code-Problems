package Java.backtracking;

//You have a maze with a obstackle. Let say a rock. You have to print the pathway without using that rock grid
public class mazeobs 
{
    public static void main(String[] args) 
    {
      obsans(3, 3, "", -1, -1);  
    }

    static void obsans(int r , int c,String ans , int obr ,int obc)
    {
        if(r==1&&c==1)
        {
            System.out.println(ans);
            return;
        }

        if(r==obr && c==obc)
        {
            return;
        }

        if(r>1)
        obsans(r-1, c, ans+'D', obr, obc);

        if(c>1)
        obsans(r,c-1,ans+'R',obr,obc);
    }
}
