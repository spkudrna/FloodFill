
public class Pair
{
    private int row;
    private int column;
    private int val;
    public Pair(int row, int column, int val)
    {
        this.row = row;
        this.column = column;
        this.val = val;
    }
    
    public int getRow()
    {
        return row;
    }
    
    public int getColumn()
    {
        return column;
    }
    
    public int getVal()
    {
        return val;
    }
    
    public void setVal(int val)
    {
        this.val = val;
    }
    
    public void setRow(int row)
    {
        this.row = row;
    }
    
    public void setColumn(int column)
    {
        this.column = column;
    }
    
    
    public String toString()
    {
        return ("Row: " + row + "\nColumn: " + column + "\nValue: " + val + "\n");
    }
    
    
    
    
}
