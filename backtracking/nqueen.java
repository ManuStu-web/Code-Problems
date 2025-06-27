package Java.backtracking;
import java.util.*;
public class nqueen 
{
  public static void main(String[] args) 
  {
     int n=1;
     char board[][]=new char[n][n];
     List<List<String>> allBoard = new ArrayList<>();
     helper(board, allBoard, 0);

     for(List<String> a:allBoard)
     {
      System.out.println(a);
     }
  }

  public static void saveboard(char board[][],List<List<String>> allboard)
  {
    List<String> newBoard = new ArrayList<>();
    String row="";
    for(int i=0;i<board.length;i++)
    {
        row= "";

        for(int j=0;j<board.length;j++)
        {
          if(board[i][j]=='Q')
          {
            row+="Q";
          }
          else
          {
            row+=".";
          }
        }
        newBoard.add(row);
    }
    allboard.add(newBoard);
  }

  public static void helper(char board[][],List<List<String>> allboard,int c)
  {
    if(c==board.length)
    {
      saveboard(board , allboard);
    }

    for(int i=0;i<board.length;i++)
    {
      if(issafe(i,c,board))
      {
        board[i][c]='Q';
        helper(board,allboard,c+1);
        board[i][c]='.';
      }
    }
  }

  public static boolean issafe(int row , int col , char board[][])
  {
    for(int c=0;c<col;c++)
    {
      if(board[row][c]=='Q')
      {
        return false;
      }
    }
    int r=row;
    for(int ud=col ; ud>=0 && r>=0 ; ud-- ,r-- )
    {
      if(board[r][ud]=='Q')
      {
        return false;
      }
    }

    int c=col;
    for(int ld=row ; ld<board.length && c>=0 ; c-- , ld++)
    {
      if(board[ld][c]=='Q')
      {
        return false;
      }
    }

    return true;
  }
}

