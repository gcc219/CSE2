//George Cooper
//Oct 23, 2015
//CSE 002


//Here we import the scanner:
import java.util.Scanner;



public class Flips
{
    public static void main(String[] args)
    {
        //Here we initialize the scanner and related variables:
        Scanner myScanner = new Scanner(System.in);
        int numFlips;
        
        
        
        //Here we prompt the user for how many times he would like to flip the coin:
        System.out.println("Please enter how many flips you would like to do (Between 0 and 100)");
        numFlips = myScanner.nextInt();



        //Here we use an if statement to terminate the program if the input is greater than 100
        if (numFlips > 100)
        {
            System.out.println("Invalid input...Program Terminating");
            return;
        }
        
        
        
        //Here we begin our switch statement to call a different function depending on whether the input is 0 or any other number.
       switch (numFlips)
       {
           case 0:
               {
                   flip();
                   break;
               }
            default:
                {
                    flip(numFlips);
                    break;
                }
       }
        
    }
    
    

//Here we write our flip method
    public static int flip()
    {
        
        
        //This creates a random number between 0 and 1, if it is less than .5, it associates it with tails.  If it is greater than .5, it associates it with heads.
        if (Math.random() < 0.5)
        {
            System.out.println("Tails: 1");
            System.out.println("Heads: 0");
            return 1;
        }
        else
        {
            System.out.println("Tails: 0");
            System.out.println("Heads: 1");
            return 0;
        }
    }
    
    

    //Here we write our flip method with one parameter
    public static void flip(int n)
    {
        
        
        
        //Here we declare the counters:
        int numTail = 0;
        int numHead = 0;
        
        
        
        //This for loop runs the flip() method as many times as the user inputed.  Every time flip results in a tails, the tails counter increase by one, the same applies for heads.
        for (int i = 0; i < n; i++)
        {
            if (flip() == 1)
            {
                numTail++;
            }
            else
            {
                numHead++;
            }
        }
        
        
        
        //Here we print out the total numbers:
        System.out.println("Total Tails: " + numTail);
        System.out.println("Total Heads: " + numHead);
    }
}