package Java.backtracking;
//Print the steps on the way in a new array to reach the end

import java.util.Arrays;

public class bt2
{
    public static void main(String[] args) 
    {
        boolean maze[][]={ {true ,true ,true },
                           {true,true ,true },
                           {true, true,true } };

        int path [][]= new int[maze.length][maze[0].length];
        backing(0, 0, maze, "",path,1);
    }

    static void backing(int r, int c , boolean maze[][], String ans, int path[][] , int count)
    {
       if(r==maze.length-1 && c==maze[0].length-1)
       {
         for(int a[]:path)
         {
            System.out.println(Arrays.toString(a));
         }
         System.out.println(ans);
         System.out.println();
         return;
       }

       if(maze[r][c]==false)
       {
        return;
       }

       maze[r][c]=false;
       path[r][c]=count;

       if(r<maze.length-1)
       {
         backing(r+1, c, maze, ans+'D',path,count+1);
       }

       if(c<maze[0].length-1)
       {
        backing(r, c+1, maze, ans+'R',path,count+1);
       }

       if(r>0)
       {
        backing(r-1, c, maze, ans+'U',path,count+1);
       }

       if(c>0)
       {
        backing(r, c-1, maze, ans+'L',path,count+1);
       }

       //At this line function will get over
       //Now before the function closes remove the false whcih we did , so that other recusrsion donot face issue
       
       maze[r][c]=true;
       path[r][c]=0;
    }
}
 
    

