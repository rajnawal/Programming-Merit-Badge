import java.util.*;
public class Magic8Ball
{
   public static void main(String[] args)
   {
     int i; 
     Scanner scan = new Scanner(System.in);
     System.out.println("Ask a question. q to quit");
     while(!scan.nextLine().equals("q")){
        i = (int)(Math.random()*8)+1;
        if (i == 1)
        {
        System.out.println("Maybe");
        }
        if (i == 2)
        {
        System.out.println("Ask again");
        }
        if (i == 3)
        {
        System.out.println("Its hazy");
        }
        if (i == 4)
        {
        System.out.println("Definitely not");
        }
        if (i == 5)
        {
        System.out.println("The stars say so");
        }
        if (i == 6)
        {
        System.out.println("Without a doubt");
        }
        if (i == 7)
        {
        System.out.println("Most Likely");
        }
        if (i == 8)
        {
        System.out.println("Very Doubtful");
        }
     }
   }
}

