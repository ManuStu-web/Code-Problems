package Java.backtracking;

import java.util.ArrayList;
class pathwaylist {

     public static void main(String[] args) 
    {
        ArrayList<String> fa = printwaylist(3, 3,"");
        System.out.println(fa);
    }

    static ArrayList<String> printwaylist(int r, int c, String ans)
   {
      if(r==1 && c==1)
      {
        ArrayList<String> answer = new ArrayList<>();
        answer.add(ans);
        return answer;
      }

      ArrayList<String> anss = new ArrayList<>();
      if(c>1)
      anss.addAll(printwaylist(r, c-1, ans+'R'));

      if(r>1)
      anss.addAll(printwaylist(r-1,c,ans+'D'));

      if(r>1 && c>1)
      {
        anss.addAll(printwaylist(r-1,c-1,ans+'A'));
      }

      return anss;
   }
}