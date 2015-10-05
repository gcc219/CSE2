//George Cooper
//October 6th, 2015
//CSE 002
//
//
//
//  The purpose of this program is to create a pyramid of a size that the user selects.
//
//
//
//
//
//  Here we import the scanner class:
import java.util.Scanner;


//  Here we declare the class:
public class pyramid
{


//  Here we declare the main method:
public static void main(String[] args)
{
    
    
    //  Here we declare all necessary variables and initialize the scanner:
    int size, stars;
    Scanner myScanner = new Scanner(System.in);
    
    
    //  Here we prompt the user for the pyramid size
    System.out.print("Please enter a pyramid size: ");
    size = myScanner.nextInt();
    
    
    //  Here we start a for loop determines the number of stars per row:
    for (int i = 0; i < size; i++)
    {
        stars = (i+1)*2-1;
        
        //  Here we nest a for loop that prints spaces equal to the size minus the row, this ensures that it is formatted like a pyramid.
        int spaces = size - i;
        for (int k = 0; k < spaces; k++)
        {
            System.out.print(" ");
        }
        
        
        //  Here we nest a for loop that prints a number of asterisks equal to the varible "stars"
            for (int j = 0; j < stars; j++)
            {
                System.out.print("*");
            }
        
        
        //Here we move to the next line for the next row of the pyramid
        System.out.println("");
    }
}
}