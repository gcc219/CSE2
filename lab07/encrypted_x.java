//George Cooper
//October 9th, 2015
//CSE 002
//
//
//
//  The purpose of this program is to print out a grid that hides the letter x in it.
//
//
//
//
//
//  Here we import the scanner class:
import java.util.Scanner;


//  Here we declare the class:
public class encrypted_x
{


//  Here we declare the main method:
public static void main(String[] args)
{
    Scanner myScanner = new Scanner(System.in);
    int input;
    int i = 1;
    int j = 1;
    //First we will prompt the user for the size of the grid:
    System.out.print("How large of a grid would you like, it can be at most 100 stars long? ");
    input = myScanner.nextInt();
    
    
    
    //Next we will check the input
    if (!(input > 0 && input <101))
    {
        System.exit(-1);
    }
    
    
    
    /*Next we will print the grid using a while loop and taking advantage of symmetry:
    The outer loop is responsible for printing the row, the inner loop is responsible for printing the contents of the row*/
    
    while (i <= input)
    {
        while (j <= input)
    {
        if (i == j || input-j == i-1)
        {
            System.out.print(" ");
        }
        else
        {
        System.out.print("*");
        }
        j++;
    }
    System.out.println("");
    i++;
    j = 1;
    }
    
}
}