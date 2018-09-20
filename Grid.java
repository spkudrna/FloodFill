import java.util.Set;
import java.util.Stack;
public class Grid
{
   private static final int SIZE =10 ;
   int[][] pixels = new int[SIZE][SIZE];
   Stack <Pair> pairs = new Stack<>();
   int count = 0;
   
   

   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
         Pair start = new Pair(row, column, count+=1);
         pairs.push(start);
         
         Pair temp = new Pair(0,0,0);
         
         int rowNum = pairs.peek().getRow();
         int columnNum = pairs.peek().getColumn();
         pixels[rowNum][columnNum] = count;
         
     while (count <100 )
     {
         //Middle Num
         temp = pairs.pop();
         
         //North
         if (temp.getRow() -1 >= 0  && pixels[temp.getRow() - 1][temp.getColumn()] == 0)
         { 
             pairs.push(new Pair (temp.getRow() -1, temp.getColumn(), ++count));
             pixels[temp.getRow()-1][temp.getColumn()] = count;
         }
         
         //East
         if (  temp.getRow() <=pixels.length &&  temp.getColumn() +1 <pixels[0].length  && pixels[temp.getRow()][temp.getColumn() + 1] == 0)
         {
             pairs.push(new Pair (temp.getRow() ,temp.getColumn() +1, ++count));
             pixels[temp.getRow()][temp.getColumn() + 1] = count;
         }
         
         //South
         if (temp.getRow() +1 < pixels.length && pixels[temp.getRow() + 1][temp.getColumn()] == 0)
         {
             pairs.push(new Pair (temp.getRow() + 1, temp.getColumn(), ++count));
             pixels[temp.getRow() + 1][temp.getColumn()] = count;
         }
   
         //West
         if (temp.getRow() >= 0 && temp.getColumn() -1 >= 0 && pixels[temp.getRow()][temp.getColumn() - 1] == 0)
         { 
             pairs.push(new Pair (temp.getRow(), temp.getColumn() - 1, ++count));
             pixels[temp.getRow()][temp.getColumn() - 1] = count;
         }
      }
   } 
        
    
      
   

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%4d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
