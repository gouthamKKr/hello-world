import java.util.*;
import java.io.*;

class Solution
{
    public static void main(String []argh)
    {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int i;
       Map<String,Integer>phoneBook = new HashMap<String,Integer>();
       for(i=0;i<n;i++)
       {
       String nam = scan.next();
       int num = scan.nextInt();
       phoneBook.put(nam,num);
       scan.nextLine();
       }
        
      while(scan.hasNext())
      {
          String name = scan.nextLine();
          if(phoneBook.get(name)==null)
          {
          System.out.println("Not found");
          }
          else
          {
          System.out.println(name+"="+phoneBook.get(name));
          }
      }
      scan.close();
       
       
    }
}
