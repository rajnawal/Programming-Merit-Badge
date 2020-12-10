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
        else if (i == 2)
        {
        System.out.println("Ask again");
        }
        else if (i == 3)
        {
        System.out.println("Its hazy");
        }
        else if (i == 4)
        {
        System.out.println("Definitely not");
        }
        else if (i == 5)
        {
        System.out.println("The stars say so");
        }
        else if (i == 6)
        {
        System.out.println("Without a doubt");
        }
        else if (i == 7)
        {
        System.out.println("Most Likely");
        }
        else if (i == 8)
        {
        System.out.println("Very Doubtful");
        }
     }
   }
}

