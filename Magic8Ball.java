public class Magic8Ball
{
   public static void main(String[] args)
   {
     // Get a random number from 1 to 8
     int i = (int)(Math.random()*8)+1; 
     // Use if statements to test the random number
     // and print out 1 of 8 random responses
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

