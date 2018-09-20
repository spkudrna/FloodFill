
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.io.*;
public class TreesSet
{
    public static void main(String[] args)
    {
          String filename = "bee.txt";
          try(Scanner bee = new Scanner(new File(filename));)
          {    
           Set <String> words = new TreeSet<>();
          
          while(bee.hasNext())
          
          {
              //Adds word to set
              words.add(clean(bee.next()));
          }
          
          for (String word : words)
          {
              //Prints unique word
              System.out.println(word);
          }
          
          //Prints number of unique words found
          System.out.println("\n" + words.size());
         }
        catch(FileNotFoundException e){}
    }
    
    //Cuts off ending punctuation (If any)
    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }

        }
        return r.toLowerCase();
    }
}


