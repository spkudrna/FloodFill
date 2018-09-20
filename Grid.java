import java.util.Set;
import java.util.Stack;
public class Grid
{
   private static final int SIZE = 10;
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
         
         //Pair temp = new Pair(0,0,0);
         
         //p.push(new Pair (x,y,count);
         
         int rowNum = pairs.peek().getRow();
         int columnNum = pairs.peek().getColumn();
         pixels[rowNum][columnNum] = pairs.peek().getVal();
         
     while (count <16 )
     {
     
         //temp = pairs.pop();    
             
         
         //North
         
         //Changes coordinates even if fill
         pairs.peek().setRow(rowNum-1);
         pairs.peek().setColumn(columnNum);
         if (rowNum -1 >= 0  && pixels[rowNum - 1][columnNum] == 0)
         {
             pairs.push(new Pair (rowNum -1, columnNum, ++count));
             pixels[rowNum-1][columnNum] = pairs.peek().getVal();
         }
         
         
         //East
         rowNum = pairs.peek().getRow();
         columnNum = pairs.peek().getColumn();
         
         //Changes coordinates even if fill
         pairs.peek().setRow(rowNum+1);
         pairs.peek().setColumn(columnNum+1);
         if (  rowNum+1 <=pixels.length &&  columnNum +1 <=pixels[0].length  && pixels[rowNum +1][columnNum + 1] == 0)
         {
             pairs.push(new Pair (rowNum + 1,columnNum +1, ++count));
             pixels[rowNum +1][columnNum + 1] = pairs.peek().getVal();
         }
         
         //South
         rowNum = pairs.peek().getRow();
         columnNum = pairs.peek().getColumn();
         
         //Changes coordinates even if fill
         pairs.peek().setRow(rowNum+1);
         pairs.peek().setColumn(columnNum-1);
         if (rowNum +1 < pixels.length && columnNum-1 >=0 && pixels[rowNum + 1][columnNum -1 ] == 0)
         {
             pairs.push(new Pair (rowNum + 1, columnNum - 1, ++count));
             pixels[rowNum + 1][columnNum -1] = pairs.peek().getVal();
         }
    
         
         //West
         rowNum = pairs.peek().getRow();
         columnNum = pairs.peek().getColumn();
         
        //Changes coordinates even if fill
         pairs.peek().setRow(rowNum-1);
         pairs.peek().setColumn(columnNum-1);
         if (rowNum -1 >= 0 && columnNum -1 >= 0 && pixels[rowNum - 1][columnNum - 1] == 0)
         {
             pairs.push(new Pair (rowNum -1, columnNum - 1, ++count));
             pixels[rowNum - 1][columnNum - 1] = pairs.peek().getVal();
         }
         
         rowNum = pairs.peek().getRow();
         columnNum = pairs.peek().getColumn();
         
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
