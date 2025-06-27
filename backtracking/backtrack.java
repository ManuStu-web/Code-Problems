package Java.backtracking;

public class backtrack 
{
    public static void main(String[] args) 
    {
        boolean maze[][]={ {true , true , true },
                           {true , true , true },
                           {true , true , true } };

        backing(0, 0, maze, "");
    }

    static void backing(int r, int c , boolean maze[][], String ans)
    {
       if(r==maze.length-1 && c==maze[0].length-1)
       {
        System.out.println(ans);
        return;
       }

       if(maze[r][c]==false)
       {
        return;
       }

       maze[r][c]=false;

       if(r<maze.length-1)
       {
         backing(r+1, c, maze, ans+'D');
       }

       if(c<maze[0].length-1)
       {
        backing(r, c+1, maze, ans+'R');
       }

       if(r>0)
       {
        backing(r-1, c, maze, ans+'U');
       }

       if(c>0)
       {
        backing(r, c-1, maze, ans+'L');
       }

       //At this line function will get over
       //Now before the function closes remove the false whcih we did , so that other recusrsion donot face issue
       
       maze[r][c]=true;
    }
}
